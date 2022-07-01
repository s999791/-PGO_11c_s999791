import java.util.List;
import java.util.ArrayList;

public class Orphanage{
    private String name;
    private List<Child> children;
    private Location location;

    public Orphanage(String name, Location location) {
        this.location = location;
        this.name = name;
        children = new ArrayList<Child>();
    }

    public void addChild(Child child) {
        children.add(child);
        child.moveTo(this.location);
    }

    public String getName() {
        return this.name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Child> getChildren() {
        return this.children;
    }
}