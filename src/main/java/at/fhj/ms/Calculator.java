package at.fhj.ms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger= LogManager.getLogger();

    public static double add(double number1, double number2){
        logger.debug(number1+" + "+number2);
        return number1 + number2;
    }
    public static double minus(double number1, double number2){
        logger.debug(number1+" - "+number2);
        return number1 - number2;
    }
    public static double divide(double number1, double number2){
        logger.debug(number1+" / "+number2);
        if (number2 == 0) {
            logger.error("Division by zero.");
            throw new ArithmeticException("Division by zero.");
        }
        return number1 / number2;
    }
    public static double multiply(double number1, double number2){
        logger.debug(number1+" * "+number2);
        return number1 * number2;
    }
    public static double faculty(int number){
      if(number>=0) {
           int f = 1;
           for (int i = 1; i <= number; i++) {
               f = f * i;
           }
           return f;
       }
       else{
           return 0;
       }

    }
    public static void main(String[] args) {
        logger.error("It is an error logger.");
        System.out.println("1 + 1 = "+add(1,1));
        logger.info("It is a info logger.");
        System.out.println("4 - 3 = "+minus(4,3));
    }
}


