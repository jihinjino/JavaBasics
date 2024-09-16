package com.string;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[100]; // Assuming a maximum of 100 grades can be entered
        int gradeCount = 0;
        int choice;

        do {
            System.out.println("Student Grading System");
            System.out.println("1. Add a new grade");
            System.out.println("2. Display all grades");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Determine highest grade");
            System.out.println("5. Determine lowest grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (gradeCount < grades.length) {
                        System.out.print("Enter the grade: ");
                        int grade = sc.nextInt();
                        grades[gradeCount] = grade;
                        gradeCount++;
                        System.out.println("Grade added successfully!");
                    } else {
                        System.out.println("Grade list is full!");
                    }
                    break;
                case 2:
                    System.out.println("All grades:");
                    for (int i = 0; i < gradeCount; i++) {
                        System.out.println(grades[i]);
                    }
                    break;
                case 3:
                    if (gradeCount == 0) {
                        System.out.println("No grades to calculate the average.");
                    } else {
                        double sum = 0;
                        for (int i = 0; i < gradeCount; i++) {
                            sum += grades[i];
                        }
                        double average = sum / gradeCount;
                        System.out.println("Average grade: " + average);
                    }
                    break;
                case 4:
                    if (gradeCount == 0) {
                        System.out.println("No grades to determine the highest.");
                    } else {
                        int highest = grades[0];
                        for (int i = 1; i < gradeCount; i++) {
                            if (grades[i] > highest) {
                                highest = grades[i];
                            }
                        }
                        System.out.println("Highest grade: " + highest);
                    }
                    break;
                case 5:
                    if (gradeCount == 0) {
                        System.out.println("No grades to determine the lowest.");
                    } else {
                        int lowest = grades[0];
                        for (int i = 1; i < gradeCount; i++) {
                            if (grades[i] < lowest) {
                                lowest = grades[i];
                            }
                        }
                        System.out.println("Lowest grade: " + lowest);
                    }
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

    }
}
