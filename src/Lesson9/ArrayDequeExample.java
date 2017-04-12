package Lesson9;

import java.util.ArrayDeque;

/**
 * Created by P-C on 3/24/2017.
 */
public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        //additing of elements
        states.add("Germany");
        states.add("Ukr");
        //additing of the elements to the begining
        states.push("USA");
        //getting first element without deleting
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            //extraction from the beginning
            System.out.println(states.pop());
        }
        System.out.printf("Размер очереди: %d \n", states.size());
    }


}
