package project;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double firstNumber, secondNumber;
        String operation = "";
        boolean sw = true;

        System.out.println("Enter first number: ");
        while (true) {
            if (scan.hasNextDouble()) {
                firstNumber = scan.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid number!");
                scan.next();
            }
        }
        System.out.println("Enter operation sign: ");
        while (sw) {
            switch (scan.next()) {
                case "+":
                    operation = "+";
                    sw = false;
                    break;
                case "-":
                    operation = "-";
                    sw = false;
                    break;
                case "*":
                    operation = "*";
                    sw = false;
                    break;
                case "/":
                    operation = "/";
                    sw = false;
                    break;
                default:
                    System.out.println("Please enter one of these operation signs: +,-,*,/");
            }
        }
        System.out.println("Enter second number: ");
        while (true) {
            if (scan.hasNextDouble()) {
                secondNumber = scan.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid number!");
                scan.next();
            }
        }
        scan.close();
        switch (operation) {
            case "+":
                double sum = firstNumber + secondNumber;
                System.out.println(sum % 1 == 0 ?   "Result of adding is " +
                                                    (int) sum : "Result of adding is " +
                                                    (double) Math.round(sum * 100) / 100);
                break;
            case "-":
                double sub = firstNumber - secondNumber;
                System.out.println(sub % 1 == 0 ?   "Result of subtracting is " +
                                                    (int) sub : "Result of subtracting is " +
                                                    (double) Math.round(sub * 100) / 100);
                break;
            case "*":
                double mul = firstNumber * secondNumber;
                System.out.println(mul % 1 == 0 ?   "Result of multiplying is " +
                                                    (int) mul : "Result of multiplying is " +
                                                    (double) Math.round(mul * 100) / 100);
                break;
            case "/":
                double div = firstNumber / secondNumber;
                System.out.println(div % 1 == 0 ?   "Result of dividing is " +
                                                    (int) div : "Result of dividing is " +
                                                    (double) Math.round(div * 100) / 100);
                break;
        }
    }
}