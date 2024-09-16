package org.launchcode;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        ArrayList<MenuItem> itemList = new ArrayList<>();

        for (int i = 0; i < itemList.size(); i++){
            if (itemList.get(i).getCategory().equals("Appetizer") ){
                System.out.println("********");
                System.out.println(itemList.get(i).getCategory().equals("Appetizer"));
                System.out.println(itemList.get(i).getCategory().equals("Name"));
                System.out.println(itemList.get(i).getCategory().equals("Description"));
                System.out.println(itemList.get(i).getCategory().equals("Price"));
                System.out.println("Date Added: " + itemList.get(i).getCategory().equals("Date"));
                System.out.println("********");
                
            }
        }
    }

}
