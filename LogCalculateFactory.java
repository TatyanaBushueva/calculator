package calculator;

//import Calculate;
//import ComplexNumber;
//import ICalculateFactory;

public class LogCalculateFactory implements ICalculateFactory {

    Logger logger;

    public LogCalculateFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculate create(ComplexNumber arg) {
        return new LogCalculator(arg, logger);
    }
}
