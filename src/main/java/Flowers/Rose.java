package Flowers;

public class Rose extends Flowers {
    private int RoseCost;
    private String Fresh;

    public Rose(int cost, String fresh, int stalkLength) {
        super(cost,fresh, stalkLength);
        Fresh = fresh;
        RoseCost = cost;
        setCost(setRoseCost(RoseCost));
    }

    public int setRoseCost(int cost) {
        switch (this.Fresh)
        {
            case "FullFresh":
                return  cost;
            case "MiddleFresh":
                return  cost -= 2;
            case "OldFresh":
                return cost -= 4;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Роза" + super.toString();
    }
}



