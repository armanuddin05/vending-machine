// Main Class File:    Sweet
// File:               Sweet.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Sweet extends Snack {
    private int sweetnessLevel;
    private static final String TYPE = "Sweet";

    // Method header
    public Sweet() {
        super("Unnamed Sweet", 0.0, 0, 0, "");
        this.sweetnessLevel = 0; 
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Sweet(String name, double price, int calories, 
            int servingSize, String texture, int sweetnessLevel) {
                super(name, price, calories, servingSize, texture);
                this.sweetnessLevel = sweetnessLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getSweetnessLevel() {
        return this.sweetnessLevel;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Sweet.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Sweet){
            return super.equals(object) && sweetnessLevel == ((Sweet)object).sweetnessLevel;
                    
        }
        else{return false;}
    }

    // Method header
    @Override
    public String toString() {
        return "Sweet (" + getName() + ") sweetnessLevel: " + 
            getSweetnessLevel();
    }
}