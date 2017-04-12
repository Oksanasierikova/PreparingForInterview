package Lesson8;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        System.out.println("начальный размер a1: " + a1.size());
        a1.add("a");
        a1.add("c");
        a1.add("d");
        System.out.println("начальный размер a1: " + a1.size());
        a1.add(1,"b");
        System.out.println("a1 contains: " + a1);
        a1.remove("d");
        a1.remove(1);
        System.out.println(a1);
    }
}
