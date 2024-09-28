// Main Class File:    VendingMachine
// File:               VendingMachine.java
// Quarter:            CSE11 Spring 24
//
// Author:             Arman Uddin, atuddin@ucsd.edu
// Instructor's Name:  Prof. Ben Ochoa
//
import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> itemList;

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public VendingMachine() {
        itemList = new ArrayList<Item>();
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void addToItemList(Item item) {
        itemList.add(item);
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public void addToItemList(Item[] items) { 
        for (int i = 0; i < items.length; i++){ 
            itemList.add(items[i]);
        }

    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public boolean hasItem(String itemName) {
        for (int i = 0; i < this.itemList.size(); i++){
            if (itemList.get(i).getName().equals(itemName)){
                return true;
            }
        }
        {return false;}
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Item getItem(String itemName) {
        for (int i = 0; i < itemList.size(); i++){
            if (itemList.get(i).getName().equals(itemName)){
                return itemList.remove(i);
                
            }
        }
        {return null;}
        

    }

    // Method header
    // helper method
    private static double computeSize(Item item) {
        if (item.getHighLevelType().equals("Snack")){
            return ((Snack)item).getServingSize() * 12.0;
        }
        else if (item.getHighLevelType().equals("Drink")){
            return ((Drink)item).getVolume();
        }
        else {return 0;}
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public static int compareSize(Item item1, Item item2) {
        double compareItem1 = computeSize(item1);
        double compareItem2 = computeSize(item2);

        if (compareItem1 < compareItem2){
            return -1;
        }
        if (compareItem1 > compareItem2){
            return 1;
        }
        else{return 0;}
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public int applyPriceSurge(double increaseRate) {
        double indexVal = (int)(Math.random() * (this.itemList.size()));
        int intIndex = (int)indexVal;
        Item selectedIndex = this.itemList.get(intIndex);
        double result = selectedIndex.getPrice() * increaseRate;
        int reultt = (int)result;

        if (increaseRate >= 1){
            selectedIndex.setPrice(reultt);
            return intIndex;
        }
        else{return intIndex;}
    }

    // Method header
    // STUDENTS NEED TO IMPLEMENT THIS METHOD
    public Item[] getItemsByType(String type) {
        
        Item[] convertedArr = new Item[itemList.size()];
        

        int newVal = 0;
        for (int i = 0; i < itemList.size(); i++){
            
            Item itemListType = itemList.get(i); 

            if (itemListType.getType().equals(type)){
            convertedArr[newVal++] = itemListType;
            }
        }
        
        return convertedArr;
    } 

    // Method header
    // helper method for testing
    public ArrayList<Item> getItemList() {
        return itemList;
    }
}