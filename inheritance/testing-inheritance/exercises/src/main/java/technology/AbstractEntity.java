package technology;

public abstract class AbstractEntity {
    private int id;
    private static int nextID = 1;

    public AbstractEntity(){
        id = nextID++;
    }

    public int getId() {
        return id;
    }

}


