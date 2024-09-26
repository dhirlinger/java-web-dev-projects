package org.funQuiz;

public class MultipleChoice extends Question{

    private int correctAnswer;

    MultipleChoice(String aQuestion, int correctAnswer){
        super(aQuestion);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer() {
        this.setUserAnswer(this.promptUserResponse());
        ;
        if (Integer.parseInt(getUserAnswer()) == correctAnswer){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculatePoints(){
        if(checkAnswer()){
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
