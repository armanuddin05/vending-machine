// Main Class File:    Drink
// File:               Drink.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Drink extends Item {
    private double volume;
    private String flavor;
    private static final String HIGH_LEVEL_TYPE = "Drink";
    private static final String TYPE = "Untyped Drink";

    // Method header
    public Drink() {
        super("Unnamed Drink", 0.0, 0);
        this.volume = 0;
        this.flavor = "";
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Drink(String name, double price, int calories, 
            double volume, String flavor) {
                super(name, price, calories);
                this.volume = volume;
                this.flavor = flavor;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public double getVolume() {
        return this.volume;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getFlavor() {
        return this.flavor;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Drink.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getHighLevelType() {
        return Drink.HIGH_LEVEL_TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Drink){
            return super.equals(object) && volume == ((Drink)object).volume
                    && flavor.equals(((Drink)object).flavor);
                    
        }
        else{return false;}
    }

    // Method header
    @Override
    public String toString() {
        return "Drink (" + getName() + ") volume: " + 
            getVolume() + "; flavor: " + getFlavor();
    }
}


