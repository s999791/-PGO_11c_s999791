
public class Crystal extends Mineral {
    private int magicPower;

    public Crystal(int power, int magicPower) {
        super(power);
        this.magicPower = magicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + magicPower;
    }
}
