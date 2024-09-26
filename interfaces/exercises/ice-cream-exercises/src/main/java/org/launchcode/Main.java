package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("\nFlavors Before: \n");
        for(int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.get(i));
        }
        System.out.println("\nCones Before: \n");
        for(int i = 0; i < cones.size(); i++){
            System.out.println(cones.get(i));
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        Comparator comparator2 = new ConeCompartor();
        cones.sort(comparator2);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nFlavors After: \n");
        for(int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.get(i));
        }
        System.out.println("\nCones After: \n");
        for(int i = 0; i < cones.size(); i++){
            System.out.println(cones.get(i));
        }

    }
}