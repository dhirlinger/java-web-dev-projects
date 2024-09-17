package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> itemList = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }

    public void addMenuItem(MenuItem item){
        boolean match = false;
        for (MenuItem aItem : itemList){
            if (aItem.equals(item)){
                match = true;
            }
        }
        if (match){
            System.out.println("Item already exists.");
        } else {
            itemList.add(item);
            lastUpdated = LocalDate.now();
        }
    }

    public void removeItem(MenuItem item){
        itemList.remove(item);
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        String phrase = "";

        System.out.println("\nCurrent Menu Items: ");
        for (MenuItem item : this.getItemList()) {
            phrase = phrase + "\n" + item.toString();
        }

        return phrase + "\n\nUpdated " + getLastUpdated();
    }
}
