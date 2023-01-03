package Model;

public class GarageDoor {

    private String up;
    private String down;
    private String stop;
    private String lightOn;
    private String lightOff;


    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getLightOn() {
        System.out.println("Garage Door light is on");
        return lightOn;
    }

    public void setLightOn(String lightOn) {
        this.lightOn = lightOn;
    }

    public String getLightOff() {
        return lightOff;
    }

    public void setLightOff(String lightOff) {
        this.lightOff = lightOff;
    }
}
