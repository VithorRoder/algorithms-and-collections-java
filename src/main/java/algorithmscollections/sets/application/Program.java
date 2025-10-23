package main.java.algorithmscollections.sets.application;

import main.java.algorithmscollections.sets.entities.Student;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> studentsHash = new HashSet<>();

        System.out.print("How many students for course A? ");
        int cA = sc.nextInt();
        for (int i = 0; i < cA; i++) {
            int studentsCA = sc.nextInt();
            studentsHash.add(new Student(studentsCA));
        }
        System.out.print("How many students for course B? ");
        int cB = sc.nextInt();
        for (int i = 0; i < cB; i++) {
            int studentsCB = sc.nextInt();
            studentsHash.add(new Student(studentsCB));
        }
        System.out.print("How many students for course C? ");
        int cC = sc.nextInt();
        for (int i = 0; i < cC; i++) {
            int studentsCC = sc.nextInt();
            studentsHash.add(new Student(studentsCC));
        }

        System.out.println("Total Students: " + studentsHash.size());

        sc.close();

    }

}
