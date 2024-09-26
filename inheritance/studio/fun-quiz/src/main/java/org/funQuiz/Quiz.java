package org.funQuiz;

public class Quiz {


    public static void main(String[] args) {
        double sumOfAllScores;
        double finalScore;
        String aQuestion = "Give answer? ";

        MultipleChoice question1 = new MultipleChoice(aQuestion, 1);

        sumOfAllScores =+ question1.calculatePoints();

        System.out.println(sumOfAllScores);

    }



}
