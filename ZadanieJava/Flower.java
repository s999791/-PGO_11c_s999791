
public class Flower extends Plant {

    public Flower(int toxicity) {
        super(toxicity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() * 2;
    }
}
