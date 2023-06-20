package calculator;

//import ComplexNumber;

public class Calculator implements Calculate {
    private final ComplexNumber complexNumber;

    public Calculator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    public void sum(ComplexNumber number) {
        int a = complexNumber.getA() + number.getA();
        int b = complexNumber.getB() + number.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
    }

    public void multiply(ComplexNumber number) {
        int a = complexNumber.getA() * number.getA() - complexNumber.getB() * number.getB();
        int b = complexNumber.getA() * number.getB() + complexNumber.getB() * number.getA(); ;
        complexNumber.setA(a);
        complexNumber.setB(b);
    }

    public void subtract(ComplexNumber number) {
        int a = complexNumber.getA() - number.getA();
        int b = complexNumber.getB() - number.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
    }

    public void divide(ComplexNumber number) {
        int a = (complexNumber.getA() * number.getA() + complexNumber.getB() * number.getB())
                / (number.getA() * number.getA()  + number.getB() * number.getB());
        int b = (complexNumber.getB() * number.getA() - complexNumber.getA() * number.getB() )
                / (number.getA() * number.getA()  + number.getB() * number.getB());
        complexNumber.setA(a);
        complexNumber.setB(b);
    }

    public ComplexNumber result() {
        return complexNumber;
    }
}
