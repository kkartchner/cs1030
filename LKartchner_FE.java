import java.util.Scanner;

public class LKartchner_FE {
   public static void main (String[] args) {
      String firstName = "";
      String lastName = "";
      double ageInYears = 0;
      double ageInMonths = 0;
      double ageInDays = 0;
      double ageInHours = 0;
      double ageInMinutes = 0;
      double ageInSeconds = 0;
      
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter first name: ");
      firstName = console.next();
      
      System.out.print("Enter last name: ");      
      lastName = console.next();
      
      System.out.print("Enter age in years: ");
      ageInYears = console.nextDouble();
      
      ageInMonths = ageInYears * 12;
      ageInDays = ageInMonths * 30;
      ageInHours = ageInDays * 24;
      ageInMinutes = ageInHours * 60;
      ageInSeconds = ageInMinutes * 60;
      
      System.out.println("\n" + lastName + ", " + firstName);
      System.out.println(ageInYears + " years old.");
      System.out.println(ageInMonths + " months old.");
      System.out.println(ageInDays + " days old.");
      System.out.println(ageInHours + " hours old.");
      System.out.println(ageInMinutes + " minutes old.");
      System.out.println(ageInSeconds + " seconds old.");
      
   }
}