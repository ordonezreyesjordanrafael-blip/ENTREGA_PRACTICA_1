
package ec.com.espoch.sacha_limpia.object;

public class Driver {
    private int id;
    private String name;
    private boolean availability;

    public Driver() {
    }

    public Driver(int id, String name, boolean availability) {
        this.id = id;
        this.name = name;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    
    
}
