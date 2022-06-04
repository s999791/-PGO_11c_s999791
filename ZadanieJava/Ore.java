

public class Ore extends Mineral {
    private boolean metallic;

    public Ore(int power, boolean metallic) {
        super(power);
        this.metallic = metallic;
    }

    public boolean getMetallic() {
        return metallic;
    }

    @Override
    public int getReagent() {
        if (metallic == true) {
            return super.getReagent();
        } else {
            return super.getReagent() / 2;
        }
    }
}
