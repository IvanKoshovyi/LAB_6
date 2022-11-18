package Object;

import Command.Command;

public class User {
    private final Command select;
    private final Command update;
    private final Command delete;
    private final Command create;

    public User(Command select, Command update, Command delete, Command create) {
        this.select = select;
        this.update = update;
        this.delete = delete;
        this.create = create;
    }

    public void selectBouquest(){
        select.execute();
    }
    public void updateBouquest(){
        update.execute();
    }
    public void deleteBouquest(){
        delete.execute();
    }
    public void createBouquest(){
        create.execute();
    }
}
