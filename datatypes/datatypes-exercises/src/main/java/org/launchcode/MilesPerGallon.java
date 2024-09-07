package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven? ");
        Double milesDriven = input.nextDouble();
        System.out.println("Gallons of gas consumed? ");
        Double gallonsConsumed = input.nextDouble();
        input.close();
        System.out.println("Miles per Gallon: " + milesDriven/gallonsConsumed);

    }
}
