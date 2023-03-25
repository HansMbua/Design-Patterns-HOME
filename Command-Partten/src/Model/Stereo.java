package Model;

public class Stereo {

    private String on;
    private String off;
    private String Cd;
    private String Dvd ,Radio;
    private int Volume;

    public void setOn(String on) {
        this.on = on;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public void setCd() {
        System.out.println("CD set");
    }

    public void setDvd(String dvd) {
        Dvd = dvd;
    }

    public void setRadio(String radio) {
        Radio = radio;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }
}
