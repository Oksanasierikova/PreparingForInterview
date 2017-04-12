package Lesson1HW1.ex1;

public class ex3 {
    public static void main(String[] args) {
        double[] currancy = {27.6, 30.8, 4.5};
        int money = 500;
        double currancyUSD = 500/currancy[0];
        double currancyEURO = 500/currancy[1];
        double currancyRU = 500/currancy[2];
        System.out.println("500 grn = " + currancyUSD + "USD");
        System.out.println("500 grn = " + currancyEURO + "EURO");
        System.out.println("500 grn = " + currancyRU + "RU");
    }
}
