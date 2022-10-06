import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number:");
      int userInput = scanner.nextInt();
      if (userInput % 2 == 0) {
        System.out.println("The number is even");
      }
      if (userInput % 2 == 1){
        System.out.println("the number is odd");
      }

  }
}
