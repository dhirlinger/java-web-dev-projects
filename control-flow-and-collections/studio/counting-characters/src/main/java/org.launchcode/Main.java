package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String phrase;

        System.out.println("Would you like to enter some words? y or n");

        Scanner input = new Scanner(System.in);

        if (input.nextLine().equals("y")) {
            System.out.println("Enter words: ");
            phrase = input.nextLine();
        } else {
            phrase = "If the product of two terms is zero " +
                    "then common sense says at least one of the " +
                    "two terms has to be zero to start with. So if " +
                    "you move all the terms over to one side, you can" +
                    " put the quadratics into a form that can be factored " +
                    "allowing that side of the equation to equal zero. " +
                    "Once you’ve done that, it’s pretty straightforward from there.";
        }

        input.close();

        char[] phraseCharacters = phrase.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();
        Character newChar;
        Integer counter = 0;
        for(int i = 0; i < phraseCharacters.length; i++){
            //counter = 0;
            if (!charCount.containsKey(phraseCharacters[i])){
                newChar = new Character(phraseCharacters[i]);
                charCount.put(newChar, 1);
            } else {
                newChar = new Character(phraseCharacters[i]);
                counter = charCount.get(newChar);
                counter++;
                charCount.put(newChar, counter);
            }

        }

        System.out.println(charCount);

    }
}