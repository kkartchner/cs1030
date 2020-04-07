import java.util.Scanner;

public class LKartchner_P2 
{
   public static void main (String[] args) 
   {
      final double ASSIGNMENT_WEIGHT = 0.5;
      final double QUIZ_WEIGHT = 0.2;
      final double MIDTERM_WEIGHT = 0.1;
      final double FINAL_WEIGHT = 0.2;

      String studentID = "";
      String firstName = "";
      String lastName = "";

      double assignmentScore = 0.0;
      double quizzesScore = 0.0;
      double midtermScore = 0.0;
      double finalExamScore = 0.0;
      
      double finalScore = 0.0;
      char finalLetterGrade = ' ';

      Scanner console = new Scanner(System.in);
      
      char choice = ' ';

      do {
         System.out.print("Enter student ID number: ");
         studentID = console.next();

         System.out.print("Enter student first name: ");
         firstName = console.next();

         System.out.print("Enter student last name: ");
         lastName = console.next();
     
         System.out.print("Enter Assignments Score: ");
         assignmentScore = console.nextInt();
     
         System.out.print("Enter Quizzes Score: ");
         quizzesScore = console.nextInt();

         System.out.print("Enter Midterm Exam Score: ");
         midtermScore = console.nextInt();

         System.out.print("Enter Final Exam Score: ");
         finalExamScore = console.nextInt();

         finalScore = (assignmentScore * ASSIGNMENT_WEIGHT) + (quizzesScore * QUIZ_WEIGHT) 
	         + (midtermScore * MIDTERM_WEIGHT) + (finalExamScore * FINAL_WEIGHT);

         if (finalScore >= 90 && finalScore <= 100) {
	         finalLetterGrade = 'A';
         } else if (finalScore >= 80 && finalScore < 90) {
	         finalLetterGrade = 'B';
         } else if (finalScore >= 70 && finalScore < 80) {
	         finalLetterGrade = 'C';
         } else if (finalScore >= 60 && finalScore < 70) {
	         finalLetterGrade = 'D';
         } else {
	         finalLetterGrade = 'E';
         }

         System.out.println("\n" + lastName + ", " + firstName);
         System.out.println("Student ID: " + studentID);
         System.out.println("Homework: " + assignmentScore);
         System.out.println("Quizzes: " + quizzesScore);
         System.out.println("Midterm: " + midtermScore);
         System.out.println("Final: " + finalExamScore);

         System.out.println("Total Score: " + finalScore + "     Grade: " + finalLetterGrade);

         System.out.println("\nWould you like to enter another student? (y/n): ");
         choice = console.next().toLowerCase().charAt(0);

      } while (choice == 'y');
   }
}
