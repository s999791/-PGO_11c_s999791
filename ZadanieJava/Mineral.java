

public class Mineral extends Ingredient {
    private int power;

    public Mineral(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return baseReagent + power;
    }
}
