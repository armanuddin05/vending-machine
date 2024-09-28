// Main Class File:    Item
// File:               Item.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
public class Item {
    private String name;
    private double price;
    private int calories;
    private static final String HIGH_LEVEL_TYPE = "Untyped High Level Item";
    private static final String TYPE = "Untyped Item";

    // Method header
    public Item() {
        this.name = "Unnamed Item";
        this.price = 0.0;
        this.calories = 0;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Item(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public String getName() {
        return this.name;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public double getPrice() {
        return this.price;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int getCalories() {
        return this.calories;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD.
    public String getType() {
        return Item.TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD.
    public String getHighLevelType() {
        return Item.HIGH_LEVEL_TYPE;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void setPrice(double price) {
        this.price = price;
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD????
    public boolean equals(Object object) {
        if(object instanceof Item){
            return (name.equals(((Item)object).name) && price == ((Item)object).price && 
                    calories == ((Item)object).calories);
        }
        else{return false;}
    }

    // The rest of getter methods don't have to be implemented.
    // They will be overridden by subclasses!
    // Method header
    public double getVolume() {
        return 0.0;
    }

    // Method header
    public String getFlavor() {
        return "";
    }

    // Method header
    public int getServingSize() {
        return 0;
    }

    // Method header
    public String getTexture() {
        return "";
    }

    // Method header
    public int getCoolnessLevel() {
        return 0;
    }

    // Method header
    public int getBoostLevel() {
        return 0;
    }

    // Method header
    public int getSweetnessLevel() {
        return 0;
    }

    // Method header
    public int getSavorinessLevel() {
        return 0;
    }

    // Method header
    @Override
    public String toString() {
        return "Item (" + getName() + ") type: " + 
            getType() + "; price: " + getPrice() + 
            "; calories: " + getCalories();
    }
}