package Flowers;

public class Iris extends Flowers {
    private int IrisCost;
    private String Fresh;
    public Iris(int cost, String fresh, int stalkLength) {
        super(cost,fresh, stalkLength);
        Fresh = fresh;
        IrisCost = cost;
        setCost(setIrisCost(IrisCost));
    }
    public int setIrisCost(int cost) {
        switch (this.Fresh) {
            case "FullFresh":
                return  cost;
            case "MiddleFresh":
                return  cost -= 3;
            case "OldFresh":
                return cost -= 6;

        }
        return cost;
    }

    @Override
    public String toString() {
        return "Ірис" + super.toString();
    }
}
