
public class Plant extends Ingredient {
    private int toxicity;

    public Plant(int toxicity) {
        this.toxicity = toxicity;
    }

    public int getToxicity() {
        return toxicity;
    }

    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }



    @Override
    public int getReagent() {
        return baseReagent * toxicity;
    }
}
