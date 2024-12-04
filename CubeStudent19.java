import java.util.Scanner;
public class CubeStudent19 {
    Scanner sc = new Scanner(System.in);
    int[][] grades = new int[5][7];
    String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    
    public void inputGrades() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter grades for " + students[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
    }
    public void displayGrades() {
        System.out.println("\nStudent Grades:");
        System.out.print("Student\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Week " + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(students[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void findHighestGradeWeek() {
        int maxSum = 0;
        int maxWeek = 0;

        for (int j = 0; j < 7; j++) {
            int weekSum = 0;
            for (int i = 0; i < 5; i++) {
                weekSum += grades[i][j];
            }
            if (weekSum > maxSum) {
                maxSum = weekSum;
                maxWeek = j + 1;
            }
        }
        System.out.println("\nWeek " + maxWeek + " has the highest total grade: " + maxSum);
    }
    public void findHighestGradeStudent() {
        int maxTotal = 0;
        int maxStudent = 0;

        for (int i = 0; i < 5; i++) {
            int studentTotal = 0;
            for (int j = 0; j < 7; j++) {
                studentTotal += grades[i][j];
            }
            if (studentTotal > maxTotal) {
                maxTotal = studentTotal;
                maxStudent = i;
            }
        }
    System.out.println("\n" + students[maxStudent] + " has the highest total grade:");
        System.out.print("Grades by week: ");
        for (int j = 0; j < 7; j++) {
            System.out.print("Week " + (j + 1) + ": " + grades[maxStudent][j] + " ");
        }
        System.out.println("\nTotal grade: " + maxTotal);
    }
    public static void main(String[] args) {
        CubeStudent19 cube = new CubeStudent19();
        cube.inputGrades();
        cube.displayGrades();
        cube.findHighestGradeWeek();
        cube.findHighestGradeStudent();
    }
}
    

