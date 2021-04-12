public class JuniorRoom extends StandardRoom {
    private boolean twinBed;
    // updates cost
    private final int cost = 180;
    // adds sofas and number of sofas variables
    private boolean sofa;
    private int numSofas;

    //No args constructor that initializes variables
    public JuniorRoom() {
        super(); // inherits superclass variables into constructor
        this.setSofa(true);
        this.setNumSofas(2);
    }
    //To string method that displays prints details of the object
    @Override
    public String toString(){
        return super.toString();
    }



    //Getters and Setters
    @Override
    public int getCost() {
        return cost;
    }

    public boolean isSofa() {
        return sofa;
    }

    public void setSofa(boolean sofa) {
        this.sofa = sofa;
    }

    public int getNumSofas() {
        return numSofas;
    }

    public void setNumSofas(int numSofas) {
        this.numSofas = numSofas;
    }
}


