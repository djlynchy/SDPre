import java.util.Scanner;
public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    int userInput = scanner.nextInt();

    if (userInput >= 0) {
      System.out.println("The number is positive.");
        }
    if (userInput < 0) {
      System.out.println("The number is a negative.");
    }
    scanner.close();
  }
}
