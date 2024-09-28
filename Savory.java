// Main Class File:    Savory
// File:               Savory.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Savory extends Snack {
    private int savorinessLevel;
    private static final String TYPE = "Savory";

    // Method header
    public Savory() {
        super("Unnamed Savory", 0.0, 0, 0, "");
        this.savorinessLevel = 0; 
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Savory(String name, double price, int calories, 
            int servingSize, String texture, int savorinessLevel) {
                super(name, price, calories, servingSize, texture);
                this.savorinessLevel = savorinessLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getSavorinessLevel() {
        return this.savorinessLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Savory.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Savory){
            return super.equals(object) && savorinessLevel == ((Savory)object).savorinessLevel;
        }
        else{return false;}
    }

    // Method header
    @Override
    public String toString() {
        return "Savory (" + getName() + ") savorinessLevel: " + 
        getSavorinessLevel();
    }
}