// Main Class File:    Energizing
// File:               Energizing.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Energizing extends Drink {
    private int boostLevel;
    private static final String TYPE = "Energizing";

    // Method header
    public Energizing() {
        super("Unnamed Energizing", 0.0, 0, 0.0, "");
        this.boostLevel = 0; 
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Energizing(String name, double price, int calories, 
            double volume, String flavor, int boostLevel) {
                super(name, price, calories, volume, flavor);
                this.boostLevel = boostLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getBoostLevel() {
        return this.boostLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Energizing.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Energizing){
            return super.equals(object) && boostLevel == ((Energizing)object).boostLevel;
                    
        }
        else{return false;}
    }

    // Method header
    @Override
    public String toString() {
        return "Energizing (" + getName() + ") boostLevel: " + 
            getBoostLevel();
    }
}