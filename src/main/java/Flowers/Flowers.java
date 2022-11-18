package Flowers;

import java.util.Objects;

public class Flowers implements Comparable<Flowers> {
    //Свойства
    private int Cost;
    private String Fresh;
    private int StalkLength;


    //Конструктор
    public Flowers(int cost, String fresh, int stalkLength) {
        Fresh = fresh;
        StalkLength = stalkLength;
        Cost = cost;}

    public String getFresh() {
        return Fresh;
    }
    public int getCost() {
        return Cost;
    }
    public int getStalkLength() {
        return StalkLength;
    }
    public void setCost(int cost) {
        Cost = cost;
    }
    public String toString() {
        {
            return "; Ціна: $" + Cost + ", Свіжість: " + Fresh + ", Довжина: " + StalkLength;
        }

    }

    @Override
    public int compareTo(Flowers other) {
        int k = 0, i = 0;
        if (Objects.equals(this.Fresh, "FullFresh")) {
            k = 1;
        }
        if (Objects.equals(this.Fresh, "MiddleFresh")) {
            k = 0;

        }
        if (Objects.equals(this.Fresh, "OldFresh")) {
            k = -1;
        }
        if (Objects.equals(other.Fresh, "FullFresh")) {
            i = 1;
        }
        if (Objects.equals(other.Fresh, "MiddleFresh")) {
            i = 0;
        }
        if (Objects.equals(other.Fresh, "OldFresh")) {
            i = -1;
        }

        if (k > i)
            return -1;
        else if (k < i)
            return 1;
        else
            return 0;
    }
}