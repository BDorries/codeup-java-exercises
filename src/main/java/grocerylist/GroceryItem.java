package grocerylist;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItem {
    private String category;
    private String name;
    private int quantity;

    private static final String[] CATEGORIES = {"Dairy","Meat","Frozen","Bread","Drinks","Snacks","Produce","Other"};

    public GroceryItem(){
        this.category = setCategory();
        this.name = setName();
        this.quantity = setQuantity();
    }

    @Override
    public String toString() {
        return String.format("%s: %d",this.name, this.quantity);
    }

    public String setCategory() {
        String categoryStr = getCategoryStr();
        Scanner scan = new Scanner(System.in);
        Input in = new Input();
        System.out.printf("""
                Please select a category:
                %s
                """,categoryStr);
        int choice = in.getInt(1,CATEGORIES.length);
        return CATEGORIES[choice-1];
    }
    public String setName() {
        System.out.print("Please enter an item name: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public int setQuantity(){
        Input in = new Input();
        return in.getInt("Please enter a quantity: ");
    }
    private String getCategoryStr() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < CATEGORIES.length; i++) {
            str.append((i+1)+"."+CATEGORIES[i]+"\n");
        }
        return str.toString();
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

}
