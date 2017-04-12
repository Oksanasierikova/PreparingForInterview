package Lesson4.Abstraction.Interface;

public class SeniorCityzen implements Movable {
    @Override
    public int move() {
        return min_step;
    }
}
