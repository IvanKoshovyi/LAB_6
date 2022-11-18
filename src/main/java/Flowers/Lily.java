package Flowers;

public class Lily extends Flowers {
    private int LilyCost;
    private String Fresh;

    public Lily(int cost, String fresh, int stalkLength) {
        super(cost,fresh, stalkLength);
        Fresh = fresh;
        LilyCost = cost;
        setCost(setLilyCoste(LilyCost));
    }
    public int setLilyCoste(int cost) {
        switch (this.Fresh)
        {
            case "FullFresh":
                return  cost;
            case "MiddleFresh":
                return  cost -= 4;
            case "OldFresh":
                return cost -= 8;

        }
        return cost;
    }
    @Override
    public String toString() {

       return "Лілія" + super.toString();
    }
}
