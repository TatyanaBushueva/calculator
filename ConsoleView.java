package calculator;

//import Calculate;
//import ComplexNumber;
//import ICalculateFactory;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    private final ICalculateFactory iCalculateFactory;

    public ConsoleView(ICalculateFactory iCalculateFactory) {
        this.iCalculateFactory = iCalculateFactory;
    }

    public void run() {
        System.out.println("Калькулятор комплексных чисел.");
        Calculate calculate = iCalculateFactory.create(getArgument());
        while (true) {
            System.out.print("Операция (+,*,-,/,=) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    calculate.sum(getArgument());
                    break;
                case "*":
                    calculate.multiply(getArgument());
                    break;
                case "-":
                    calculate.subtract(getArgument());
                    break;
                case "/":
                    calculate.divide(getArgument());
                    break;
                case "=":
                    System.out.println("Результат: " + calculate.result());
                    System.out.print("Продолжить y/n: ");
                    String nextCircle = scanner.nextLine().toLowerCase();
                    if (nextCircle.equals("n")) {
                        return;
                    } else {
                        calculate = iCalculateFactory.create(getArgument());
                    }
                    break;
                default:
                    System.out.println(input + " - неподдерживаемя операция");
            }
        }
    }
//\d+[\.,\d*]?[^\.]?\+\d+[\.,]?\d*[_\*x][ij]             ^[\\d]+\\+[\\d]+[i]$
    private ComplexNumber getArgument() {
        System.out.print("Введите комплексное число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+\\+[\\d]+[i]$")) {
            System.out.print(input + " - не является комплексным числом, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }
}
