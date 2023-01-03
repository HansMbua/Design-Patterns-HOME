package Model;

public class Light {

    private int on;
    private int off;


    public int getOn() {
        System.out.println("light is on");
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public int getOff() {
        System.out.println("light is off");
        return off;
    }

    public void setOff(int off) {
        this.off = off;
    }
}
