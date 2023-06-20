package calculator;

//import ComplexNumber;

public class CalculateFactory implements ICalculateFactory {
    public Calculate create(ComplexNumber arg) {
        return new Calculator(arg);
    }

}
