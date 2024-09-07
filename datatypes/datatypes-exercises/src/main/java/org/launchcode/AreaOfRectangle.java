package org.launchcode;
import  java.util.Scanner;
import java.util.ArrayList;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's length?");
        Double length = input.nextDouble();

        System.out.println("What is the width?");
        Double width = input.nextDouble();

        input.close();
        System.out.println("The area of rectangle: " + length * width);

    }
}
