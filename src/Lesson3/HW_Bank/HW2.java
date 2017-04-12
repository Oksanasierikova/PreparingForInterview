package Lesson3.HW_Bank;


import java.util.Locale;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        String USD = "USD";
        String EUR = "EUR";

        Bank privat = new Bank(25, 50);
        Bank pumb = new Bank(20, 25);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Bank:");
        String bankName = in.nextLine();

        System.out.println("Enter the currency to convert (USD or EUR): ");
        String currency = in.nextLine();

        System.out.println("Enter the amount of money that you want to change: ");
        int amount = in.nextInt();

        if (bankName.equals("privat")) {
            if (USD.equalsIgnoreCase(currency)) {
                System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD, amount / privat.COURSE_USD));
            } else if (EUR.equalsIgnoreCase(currency)) {
                System.out.println(String.format(Locale.US, "You money in %s: %.2f", EUR, amount / privat.COURSE_EUR));
            } else {
                System.err.println("Can't convert to " + currency);
            }
        } else if (bankName.equals("pumb")) {
            if (USD.equalsIgnoreCase(currency)) {
                System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD, amount / pumb.COURSE_USD));
            } else if (EUR.equalsIgnoreCase(currency)) {
                System.out.println(String.format(Locale.US, "You money in %s: %.2f", EUR, amount / pumb.COURSE_EUR));
            } else {
                System.err.println("Can't convert to " + currency);
            }
        } else {
            System.err.println("You enter wrong bank's name");
        }
    }
}
