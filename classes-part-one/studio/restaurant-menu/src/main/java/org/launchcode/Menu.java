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
        itemList.add(item);
    }

    public void removeItem(MenuItem item){
        itemList.remove(item);
    }

}
