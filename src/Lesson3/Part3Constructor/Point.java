package Lesson3.Part3Constructor;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public  void printPoint(){
        String coordinates = "x = " + x + ";y = "+ y;
        System.out.println(coordinates);
    }
}
