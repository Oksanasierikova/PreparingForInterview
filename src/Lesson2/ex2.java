package Lesson2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("there is no results");
        } else if (d == 0) {
            int sum = -b / (2 * a);
            System.out.println(sum);
        } else if (d > 0) {
            int sum1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            int sum2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println(sum1 + ", " + sum2);
        }
    }
}
