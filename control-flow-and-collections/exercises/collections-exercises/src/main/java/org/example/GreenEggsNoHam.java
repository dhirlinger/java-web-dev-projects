package org.example;
import java.util.Arrays;

public class GreenEggsNoHam {
    public static void main(String[] args) {
     String sillySentence = "I would not, could not, in a box. " +
             "I would not, could not with a fox. " +
             "I will not eat them in a house. " +
             "I will not eat them with a mouse.";
     String [] sillyWords = sillySentence.split("\\.");
     System.out.println(Arrays.toString(sillyWords));
    }
}
