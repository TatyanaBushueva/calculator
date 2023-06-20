package calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    String fileName;
    DateTimeFormatter fileNameDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public FileLogger() {
        this.fileName = LocalDateTime.now().format(fileNameDate) + ".log";
    }

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(LocalDateTime.now().format(formatter) + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
