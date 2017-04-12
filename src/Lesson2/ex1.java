package Lesson2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter three numbers");
        String first = in.nextLine();
        String second = in.nextLine();
        String third = in.nextLine();

        if (Integer.valueOf(first) < Integer.valueOf(second) && Integer.valueOf(first) < Integer.valueOf(third)){
            int sum = Integer.valueOf(second)*Integer.valueOf(second) + Integer.valueOf(third)*Integer.valueOf(third);
            System.out.println(sum);
        }
        else if (Integer.valueOf(second) < Integer.valueOf(first) && Integer.valueOf(second) < Integer.valueOf(third)){
            int sum2 = Integer.valueOf(first)*Integer.valueOf(first) + Integer.valueOf(third)*Integer.valueOf(third);
            System.out.println(sum2);
        }
        else
        {int sum3 = Integer.valueOf(first)*Integer.valueOf(first) + Integer.valueOf(second)*Integer.valueOf(second);
            System.out.println(sum3);
        }
    }
}
