package Object;

import Bouquest.Create_Bouquest;
import Shop.Flowers_in_the_shop;

public class Comp {
    public void select(){ Flowers_in_the_shop.wotch(); }
    public void update(){
        Flowers_in_the_shop.update();
    }
    public void delete(){
        Flowers_in_the_shop.delete();
    }
    public void create(){
        Create_Bouquest.Create();
    }
}
