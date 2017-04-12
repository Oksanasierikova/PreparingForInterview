package Lesson8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by P-C on 3/24/2017.
 */
public class Sorter {

    public static void main(String[] args) {
        Set sorted = new TreeSet();
        sorted.add(new Integer(2));
        sorted.add(new Integer(3));
        sorted.add(new Integer(1));
        System.out.println(sorted);

    }
}
