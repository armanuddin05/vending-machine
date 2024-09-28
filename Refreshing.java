// Main Class File:    Refreshing
// File:               Refreshing.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Refreshing extends Drink {
    private int coolnessLevel;
    private static final String TYPE = "Refreshing";

    //: Method header
    public Refreshing() {
        super("Unnamed Refreshing", 0.0, 0, 0.0, "");
        this.coolnessLevel = 0; 
    }

    //: Method header
    //: STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Refreshing(String name, double price, int calories, 
            double volume, String flavor, int coolnessLevel) {
                super(name, price, calories, volume, flavor);
                this.coolnessLevel = coolnessLevel;
    }

    //: Method header
    //: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public int getCoolnessLevel() {
        return this.coolnessLevel;
    }

    //: Method header
    //: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Refreshing.TYPE;
    }

    //: Method header
    //: STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Refreshing){
            return super.equals(object) && coolnessLevel == ((Refreshing)object).coolnessLevel;
                    
        }
        else{return false;}
    }

    //: Method header
    @Override
    public String toString() {
        return "Refreshing (" + getName() + ") coolnessLevel: " + 
        getCoolnessLevel();
    }
}