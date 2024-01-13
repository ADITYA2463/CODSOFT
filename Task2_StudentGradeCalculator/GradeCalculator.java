import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Physics:");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter marks for Chemistry:");
        int subject2Marks = scanner.nextInt();

        System.out.println("Enter marks for Mathematics:");
        int subject3Marks = scanner.nextInt();

        System.out.println("Enter marks for Biology:");
        int subject4Marks = scanner.nextInt();

        System.out.println("Enter marks for SocialScience:");
        int subject5Marks = scanner.nextInt();

        // Calculate total marks
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        // Calculate average percentage
        double averagePercentage = totalMarks / 5.0;

        // Determine grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks in PCM : " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
