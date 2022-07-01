import java.util.List;
import java.util.ArrayList;
public class Voldemort extends Character {
    public int horcruxes = 0;
    public List<Character> characters = new ArrayList<>();
    public void createHorcruxes(int n) {;
        horcruxes += n;}

    public Voldemort(String name, Location location) {
		super(name, location);
		//TODO Auto-generated constructor stub
	}


   public Voldemort(Riddle tom){
        super("Lord Voldemort", tom.getLocation());
        super.removeInstance(tom);
   }

    public void printHorcruxes() {
        System.out.println("Created horcruxes:");
        for(int i = 1; i <= horcruxes; i++) {
            System.out.println("\thorcrux " + Integer.toString(i));
        }
    }

    public void castSpell(Spell avadakedavra) {
        for(Character character : characters){
            if(character.getName() != "Harry"){
                character.setHp(0);
            }
        }
        System.out.println("James died.");
        System.out.println("Lily died."); 
        System.out.println("Harry goes LOL..."); 
        System.out.println("Lord Voldemort died.");
        this.setHp(0);
    }

    public void target(Character character) {
        characters.add(character);
    }
}