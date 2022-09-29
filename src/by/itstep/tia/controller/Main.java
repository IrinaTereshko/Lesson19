package by.itstep.tia.controller;

import by.itstep.tia.model.logic.StudentsManager;
import by.itstep.tia.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input count of students: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        System.out.println("Input student's marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }


        double avg = StudentsManager.calcAvgStudentMark(marks);

        String msg = String.format("Student's average mark is %.2f", avg);

        Printer.print(msg);
    }
}
