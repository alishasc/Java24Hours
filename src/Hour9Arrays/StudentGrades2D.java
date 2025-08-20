package Hour9Arrays;

import java.util.Scanner;

// activity 1
public class StudentGrades2D {
    public static void main(String[] args) {
        // 2d array - 2x2
        int[][] grades = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        int[] averageGrade = new int[2];

        // first = number for each student
        // second = student grade
        for (int i = 0; i < grades.length; i++) {
            // track total marks for one student
            int total = 0;

            for (int j = 0; j < grades.length; j++) {
                // ask for grade for each student
                System.out.print("Grade for student " + i + ": ");
                int grade = scanner.nextInt();
                total += grade;

                grades[i][j] = grade; // number: grade
            }

            // work out average mark from a student's total
            averageGrade[i] = total / grades.length;
        }

        System.out.println();

        // display average mark for each student
        for (int i = 0; i < averageGrade.length; i++) {
            System.out.println("The average grade for student " + i + ": " + averageGrade[i]);
        }
    }
}
