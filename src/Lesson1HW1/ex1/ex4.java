package Lesson1HW1.ex1;

public class ex4 {
    public static void main(String[] args) {
        String[][] person = {{"Eugen", "Oksana", "Inna", "Gena"}, {
                "1986", "1987", "1965", "1963"}};
        int currentYear = 2017;
        int ageEugen = currentYear - Integer.valueOf(person[1][0]);
        int ageInna = currentYear - Integer.valueOf(person[1][2]);
        int ageGena = currentYear - Integer.valueOf(person[1][3]);
        System.out.println(person[0][0] + ": " + ageEugen);
        System.out.println(person[0][2] + ": " + ageInna);
        System.out.println(person[0][3] + ": " + ageGena);
    }
}
