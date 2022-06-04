
public class Water extends Liquid {
    private boolean distilated;

    public Water(int dissolubility, boolean distilated) {
        super(dissolubility);
        this.distilated = distilated;
    }

    public boolean getDistilated() {
        return distilated;
    }

    @Override
    public int getReagent() {
        if (distilated == true) {
            return super.getReagent();
        } else {
            return super.getReagent() / 2;
        }
    }
}
