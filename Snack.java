// Main Class File:    Snack
// File:               Snack.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Snack extends Item {
    private int servingSize;
    private String texture;
    private static final String HIGH_LEVEL_TYPE = "Snack";
    private static final String TYPE = "Untyped Snack";

    // Method header
    public Snack() {
        super("Unnamed Snack", 0.0, 0);
        this.servingSize = 0;
        this.texture = "";
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Snack(String name, double price, int calories, 
            int servingSize, String texture) {
                super(name, price, calories);
                this.servingSize = servingSize;
                this.texture = texture;

    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int getServingSize() {
        return this.servingSize;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getTexture() {
        return this.texture;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getType() {
        return Snack.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public String getHighLevelType() {
        return Snack.HIGH_LEVEL_TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    @Override
    public boolean equals(Object object) {
        if(object instanceof Snack){
            return super.equals(object) && servingSize == ((Snack)object).servingSize
                    && texture.equals(((Snack)object).texture);
                    
        }
        else{return false;}
    }

    // Method header
    @Override
    public String toString() {
        return "Snack (" + getName() + ") servingSize: " + 
            getServingSize() + "; texture: " + getTexture();
    }
}


