package Lesson2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int numRows = in.nextInt();
        String[] arrayOfRows = new String[numRows];
        int[] arrayOfRowLength = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = in.next();
            arrayOfRows[i] = row;
            arrayOfRowLength[i] = row.length();
        }

        int minLength = 0;
        String minLengthRow = arrayOfRows[0];

        for (int i = 0; i < numRows; i++) {
            if (minLength > arrayOfRowLength[i]) {
                minLength = arrayOfRowLength[i];
                minLengthRow = arrayOfRows[i];
            }
        }
//print row with min length
        System.out.println("The shortest row is: " + minLengthRow);
        System.out.println("Line length is " + minLengthRow.length());
    }
}
