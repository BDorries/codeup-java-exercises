package grocerylist;

import util.Input;

import java.util.ArrayList;

public class GroceryApp {

    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        Input in = new Input();

        while(true){
            if(in.yesNo("Add items? Y/N")){
                groceryList.add(makeItem());
            } else{
                System.out.println("Your list:");
                System.out.println(printList(groceryList));
                break;
            }
        }
    }

    public static GroceryItem makeItem(){
        return new GroceryItem();
    }

    public static String printList(ArrayList<GroceryItem> list){
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            str
                .append(list.get(i).getName())
                .append(":")
                .append(list.get(i).getQuantity())
                .append("\n");
        }
        return str.toString();
    }
}
