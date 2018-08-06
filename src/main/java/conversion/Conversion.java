package conversion;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        double fahrenheitDeg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor body temperature, in Fahrenheit degrees: ");
        fahrenheitDeg = scanner.nextDouble();
        double result = getCelsius(fahrenheitDeg);
        System.out.println("Your body temperature in Celsius degrees is " + result);
        if (result > 37) {
            System.out.println("You are ill !");
        }

    }

    public static double getCelsius(double fahrenheitDeg) {
        //returns the Celsius temperature rounded to one decimal.
        double celsiusDeg = (fahrenheitDeg - 32) * 5 / 9;
        celsiusDeg = Math.round(celsiusDeg * 10) / 10.0;
        return celsiusDeg;
    }
}
