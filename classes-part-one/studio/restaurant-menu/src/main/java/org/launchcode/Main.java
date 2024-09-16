package org.launchcode;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {

    public static void main(String[] args) {
	   //created menu items

        MenuItem item1 = new MenuItem("Yummy Tofu", 10.00, "Delicious Sweet and Savory Tofu", "Main");
        MenuItem item2 = new MenuItem("Sting Beans", 5.00, "Sauted in olive oil and garlic with herbs and spices", "Appetizer");
        MenuItem item3 = new MenuItem("Mini Ice Cream Cone", 2.00, "Trader Joe's Mini Ice Cream Cones", "Dessert");

        //create menu

	    Menu menu1 = new Menu();

        //add items

        menu1.addMenuItem(item1);
        menu1.addMenuItem(item2);
        menu1.addMenuItem(item3);

        //test print items

        System.out.println("\nCurrent Menu Items: ");
        for (MenuItem item : menu1.getItemList()) {
            System.out.println("\n" + item.getName() + "\n" + item.getCategory() + "\n" +
                    item.getDescription() + "\n" + item.getPrice());
        }


        String someDate = LocalDate.now().toString().substring(8, 10);
        System.out.println(someDate);
    }


}
