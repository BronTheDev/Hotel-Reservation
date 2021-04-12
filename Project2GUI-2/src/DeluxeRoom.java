public class DeluxeRoom extends StandardRoom{
    private boolean twinBed;
    // updates cost
    private final int cost = 140;

    //No args constructor that initializes variables
    public DeluxeRoom(){
        super(); // inherits superclass variables into constructor
        setTwinBed(true);
    }
    //To string method that displays prints details of the object
    @Override
    public String toString(){
        return super.toString();
    }

    //getters and setters
    public void setTwinBed(boolean twinBed) {
        this.twinBed = twinBed;
    }
    @Override
    public int getCost() {
        return cost;
    }
}
