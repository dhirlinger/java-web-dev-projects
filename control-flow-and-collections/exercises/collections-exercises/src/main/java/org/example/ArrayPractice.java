package org.example;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] myArr = {1, 1, 2, 3, 5, 8};
        for (int singleInt : myArr){
            if(singleInt % 2 == 0) {
                System.out.println(singleInt);
            }
        }
    }
}
