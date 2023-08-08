package CLASSPACK;

public class trafficLight {
    protected String Color;
    protected int Duration;

    public void setColor(String color) {
        Color = color;
    }
    public void setDuration(int duration) {
        Duration = duration;
    }
    public String getColor() {

        return Color;
    }
    public int getDuration() {
        return Duration;
    }
    public void checkLight() {
        if (Color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else if (Color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        }
    }

}
