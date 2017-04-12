package Lesson3;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(ClassWork.getSolution(1,2,3));
    }

    static double[] getSolution(int a, int b, int c) {
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            return null;
        } else {
            double[] solutions = new double[2];
            solutions[0] = (-b + Math.sqrt(d)) / (2 * a);
            solutions[1] = (-b - Math.sqrt(d)) / (2 * a);
            return solutions;
        }
    }
}
