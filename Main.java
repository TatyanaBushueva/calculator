package calculator;

//import FileLogger;
//import LogCalculateFactory;
//import Logger;
//import ConsoleView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        LogCalculateFactory logCalculateFactory = new LogCalculateFactory(logger);
        ConsoleView consoleView = new ConsoleView(logCalculateFactory);
        consoleView.run();
    }
}
