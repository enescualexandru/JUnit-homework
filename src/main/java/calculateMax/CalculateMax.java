package calculateMax;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter first integer number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second integer number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third integer number: ");
        c = scanner.nextInt();
        System.out.println("The biggest number is: " + getMax(getMax(a, b), c));
    }

    public static int getMax(int a, int b) {

        return a < b ? b : a;
    }
}
