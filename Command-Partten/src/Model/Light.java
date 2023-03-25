package Model;

public class Light {

    private int on;
    private int off;

    private String description;

    public Light(String description) {
        this.description = description;
    }

    public int getOn() {
        System.out.println(description+" light is on");
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public int getOff() {
        System.out.println(description+" light is off");
        return off;
    }

    public void setOff(int off) {
        this.off = off;
    }
}
