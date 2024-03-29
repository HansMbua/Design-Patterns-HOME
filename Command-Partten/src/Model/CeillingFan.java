package Model;

public class CeillingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeillingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        speed = HIGH;
    }
    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }
    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed; // using get to get the current speed
    }

}
