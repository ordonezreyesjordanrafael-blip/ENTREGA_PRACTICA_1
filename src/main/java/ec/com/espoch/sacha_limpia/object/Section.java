package ec.com.espoch.sacha_limpia.object;

public class Section {
   private String name;
   private double length;
   private double time;

    public Section() {
    }

    public Section(String name, double length, double time) {
        this.name = name;
        this.length = length;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
   
   
   
}
