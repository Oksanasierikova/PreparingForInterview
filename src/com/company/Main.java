package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] anArray;
//        anArray = new int[2];
//        anArray[0] = 100;
//        anArray[1] = 200;
//        System.out.println("element at index 0: " + anArray[0]);
//        System.out.println("element at index 1: " + anArray[1]);
//        int[] anArray2 = {100, 200};
//        String[][] names = { {"Mr. ", "Mrs. ", "Ms. ", "Miss."},
//                {"Smith", "Jones"}};
//        System.out.println(names[0][3] + names[1][1]);
//        int result = 1 + 3;
//        System.out.println(result);
//        result = result + 6;
//        System.out.println(result);
//        result = result % 7;
//        System.out.println(result);
//        int i = 3;
//        i = i+1;
//        System.out.println(i);
//        ++i;
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i++);//не изменяет значение
//        System.out.println(i);

//        int aNumber = 3;
//        if (aNumber >= 0) {
//            if (aNumber == 0) {
//                System.out.println("first string");
//            } else {
//                System.out.println("second string");
//            }
//        }
//        System.out.println("third string");
        ////////////////
//int month = 3;
//String monthString;
//switch (month){
//    case 1: monthString = "January";
//    break;
//    case 2: monthString = "February";
//    break;
//    case 3: monthString = "March";
//    break;
//    default: monthString = "Invalid";
//}
//        System.out.println(monthString);

//        int count = 1;
//        do {
//            System.out.println("count is: " + count);
//            count++;
//        }
//        while (count < 11);
//
//        int j =1;
//        while (j <4){
//            System.out.println(j);
//            j++;
//        }

//        for (int i=1; i< 5; i ++){
//            System.out.println(i);
//        }
//int[] numbers ={1,2,3,4,5};
//        for (int item : numbers) {
//            System.out.println(item);
//        }

//        int arrayOfInts[] = {3, 4,5,6};
//        int searchfor = 4;
//        boolean foundit = true;
//        for (int i = 0; i < arrayOfInts.length; i++) {
//            if (arrayOfInts[i] == searchfor) {
//                foundit = true;
//            }
//           break;
//        }
//
//    String searchMe = "nrqwr";
//    int max = searchMe.length();
//    int numPs = 0;
//    for (int i =0; i < max; i++)
//        if (searchMe.charAt(i)!= 'r')
//           continue;
//    numPs ++;

//        int arrayOfInts[][] = {{3, 4, 5, 6}, {1, 2, 3, 4}};
//        int searchfor = 4;
//        boolean foundit = true;
//        search:
//        for (int i = 0; i < arrayOfInts.length; i++) {
//            for (int j = 0; j < arrayOfInts.length; j++) {
//                if (arrayOfInts[i][j] == searchfor) {
//                    foundit = true;
//                    break search;
//                }
//            }
//        }
        Scanner in = new Scanner(System.in);
        System.out.println("please, enter your name");
        String name = in.nextLine();
        System.out.println("your name is: " + name);

    }
}
