package org.funQuiz;

import java.util.Scanner;

public abstract class Question {
    private String question;
    private String userAnswer;
    private double points;

    public Question(){};

    public Question(String question){
        this.question = question;
    }

    public String promptUserResponse(){
        System.out.println(question);
        Scanner input = new Scanner(System.in);
        userAnswer = input.nextLine();
        return userAnswer;
    }

    public abstract boolean checkAnswer();

    public abstract double calculatePoints();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
