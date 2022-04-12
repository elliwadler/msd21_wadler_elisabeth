package at.fhj.ms;

public class Calculator {
    public static double add(double number1, double number2){
        return number1 + number2;
    }
    public static double minus(double number1, double number2){
        return number1 - number2;
    }
    public static double divide(double number1, double number2){
        return number1 / number2;
    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
    public static void main(String[] args) {

        System.out.println("add (3+8): "+add(3,8));
        System.out.println("minus (14-5): "+minus(14,5));
        System.out.println("multiply (15*3): "+multiply(15,3));
        System.out.println("divide (90/9): "+divide(90,9));
    }
}
