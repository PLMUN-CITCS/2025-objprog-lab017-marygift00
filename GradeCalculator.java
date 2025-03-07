import java.util.Scanner;

public class GradeCalculator {
    
    // Method to get student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score;

        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Double.parseDouble(scanner.nextLine());
                
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input. Score must be between 0 and 100.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        scanner.close();
        return score;
    }

    // Method to determine letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main program flow
    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }
}
