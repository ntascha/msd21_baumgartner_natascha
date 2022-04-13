package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        double additionResult = number1+number2;
        return additionResult;
    }

    public double minus(double number1, double number2){
        double subResult = number1-number2;
        return subResult;
    }

    public double divide(double number1, double number2){
        double divResult = number1/number2;
        return divResult;
    }

    public double multiply(double number1, double number2){
        double multResult = number1*number2;
        return multResult;
    }
}
