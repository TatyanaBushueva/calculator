package calculator;

//import calculator.ComplexNumber;

public interface Calculate {
    void sum(ComplexNumber number);

    void multiply(ComplexNumber number);

    void subtract(ComplexNumber number);

    void divide(ComplexNumber number);

    ComplexNumber result();
}
