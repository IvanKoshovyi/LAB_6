package Flowers;

public class Tulip extends Flowers{
    private int TulipCost;
    private String Fresh;

    public Tulip(int cost, String fresh, int stalkLength) {
        super(cost,fresh, stalkLength);
        Fresh = fresh;
        TulipCost = cost;
        setCost(setTulipCost(TulipCost));
    }
    public int setTulipCost(int cost) {
        switch (this.Fresh)
        {
            case "FullFresh":
                return  cost;
            case "MiddleFresh":
                return  cost -= 5;
            case "OldFresh":
                return cost -= 7;
        }
        return cost;
    }

    @Override
    public String toString() {

        return "Тюльпан" + super.toString();
    }
}
