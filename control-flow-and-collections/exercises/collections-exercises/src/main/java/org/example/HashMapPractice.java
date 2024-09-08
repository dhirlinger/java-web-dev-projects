package org.example;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student information or ENTER to finish: ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine().trim();

            if (!newStudent.equals("")){
                System.out.println("Student ID");
                Integer studentID = input.nextInt();
                students.put(studentID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("Student: " + student.getValue() + "'s ID is " + student.getKey());
        }

    }

}
