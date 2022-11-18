package Command;
import Object.Comp;

public class SelectCommand implements Command{
    private Comp comp;

    public SelectCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute(){
        comp.select();
    }
}
