package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> myInts = new ArrayList<>();
        myInts.add(2);
        myInts.add(14);
        myInts.add(3);
        myInts.add(15);
        myInts.add(5);
        myInts.add(112);
        myInts.add(21);
        myInts.add(141);
        myInts.add(25);
        myInts.add(149);

        ArrayList<String> myWords = new ArrayList<>();
        myWords.add("flake");
        myWords.add("drums");
        myWords.add("cymbals");
        myWords.add("snow");
        myWords.add("sounds");

        String someWords = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        ArrayList<String> sillyWords = new ArrayList<>(Arrays.asList(someWords.split(" ")));

        System.out.println(getSumOfEven(myInts));
        printWords(myWords);
        printWords(sillyWords);



    }


      static int getSumOfEven(ArrayList<Integer> ints) {
        int sum = 0;
        for (int anInt : ints) {
            if( anInt % 2 == 0 ){
                sum += anInt;
            }
        }
        return sum;
    }

    static void printWords(ArrayList<String> words){
        int wordLength = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        wordLength = input.nextInt();
        for(String word : words) {
            if (word.length() == wordLength){
                System.out.println(word);
            }
        }
    }

}
