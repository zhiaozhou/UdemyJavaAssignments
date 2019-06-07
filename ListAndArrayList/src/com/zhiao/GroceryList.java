package com.zhiao;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + "items in your grocery list");
//        for (int i=0;i<groceryList.size();i++) {
//            System.out.println((i+1) + ". " + groceryList.get(i));
//        }
        System.out.println(groceryList.toString());
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + (position + 1) + " has been removed.");
    }

    public int findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position < 0) {
            System.out.println("This item is not in the array");
        }
        return position;
    }
}
