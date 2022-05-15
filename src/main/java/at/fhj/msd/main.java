package at.fhj.msd;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main {

    public static void main(String[] args) {

    Calculator Calculator = new Calculator();

        System.out.println(Calculator.add(5, 3));
        System.out.println(Calculator.minus(5, 3));
        System.out.println(Calculator.multiply(5, 3));
        System.out.println(Calculator.divide(4, 2));
        System.out.println(Calculator.faculty(5));
        System.out.println(Calculator.faculty(5));
        System.out.println(Calculator.faculty(-5));
    }

}
