import java.util.Scanner;
import java.time.LocalDate;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int userInput = input.nextInt();


    int birthYear1 = 2022 - userInput;

    System.out.println("You were born in " + birthYear1);
input.close();

  }
}
