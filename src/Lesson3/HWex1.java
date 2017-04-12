package Lesson3;

import java.util.Scanner;

public class HWex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please, enter text: ");
        String text = in.nextLine();

        int count_sentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(".")) {
                count_sentences++;
            }
        }
        System.out.println(count_sentences);
    }
}
