package at.fhj.msd;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.error("It is an error logger.");
        logger.info("It is a info logger.");

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
