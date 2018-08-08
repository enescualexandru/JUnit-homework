package dataValidation;

import java.util.Scanner;

public class DataValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte hour, minute;
        System.out.println("What time is is ?");
        System.out.println("Please enter hour:");
        hour = scanner.nextByte();
        System.out.println("Please enter minutes:");
        minute = scanner.nextByte();
        if (validateTime(hour, minute)) {
            System.out.println("The time is " + formatTime(hour, minute) + " now.");
        } else {
            System.out.println("Incorrect time !");
        }
    }

    public static boolean validateTime(int hour, int minute) {

        return (hour < 24 && minute < 60) && (hour >= 0 && minute >= 0);
    }

    public static String formatTime(int hour, int minute) {
        return String.format("%02d", hour) + String.format("%02d", minute);
    }
}
