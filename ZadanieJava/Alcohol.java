
public class Alcohol extends Liquid {
    private int percent; // [0,...100]

    public Alcohol(int dissolubility, int percent) {
        super(dissolubility);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * (percent / 100);
    }
}
