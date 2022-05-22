package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {



    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        double additionResult = number1 + number2;
        logger.debug(number1 + " + " + number2);
        return additionResult;
    }

    public double minus(double number1, double number2) {
        double subResult = number1 - number2;
        logger.debug(number1 + " - " + number2);
        return subResult;
    }

    public static double divide(double number1, double number2) throws ArithmeticException {
        double divResult = number1 / number2;
        logger.debug(number1 + " / " + number2);
        if (number2 == 0) {
            logger.error("Division with Zero");
            throw new ArithmeticException();
        }
        return divResult;
    }

    public double multiply(double number1, double number2) {
        double multResult = number1 * number2;
        logger.debug(number1 + " * " + number2);
        return multResult;
    }

    public static double faculty(int number) {
    if (number < 1) {
        return 0;
    }
    int temp = 1;
    for (int i = 2; i <= number; i++) {
        temp = temp * i;
    }
    return temp;
    }
}

