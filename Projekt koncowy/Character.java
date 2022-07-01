import java.util.ArrayList;
import java.util.List;
    public class Character {
    private String name;
    private Location location;
    private int hp;
    private static List<Character> classInstances = new ArrayList<>();

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
        hp = 100;
        classInstances.add(this);
    }

    public static void doSth(String action, Character... characters) {
        for(Character chr : characters) {
            chr.doSth(action);
        }
    }

    public void doSth(String action) {
        System.out.println("I am " + this.name + ", I am " + action);
    }

    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public void say(String words, Character target) {
        System.out.println(this.name + " to " + target.getName());
        System.out.println("\t" + words);
    }

    public static void status() {
        System.out.println("====Status====");
        for(Character chr : classInstances) {
            System.out.println(chr.getName() + " : " + Integer.toString(chr.getHp())); 
        }
        System.out.println("==============");
    }

    public void moveTo(Location newPlace) {
        location = newPlace; 
    }
    
    public void moveTo(Orphanage orphanage){
        location = orphanage.getLocation();
    }

    public static void MoveAllTo(Location newPlace, Character... characters){
        for(Character chr : characters) {
            chr.moveTo(newPlace);
        }
    }

    public String getName() {
        return this.name;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void removeInstance(Character character){
        classInstances.remove(character);
    }
}