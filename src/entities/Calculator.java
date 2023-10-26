package entities;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }

    public double soma() {
        return  num1 + num2;
    }

    public double subtracao(){
        return  num1 - num2;
    }

    public double multiplicacao() {
        return  num2 * num1;
    }

    public double divisao() {
        return  num1 * num2;
    }

}
