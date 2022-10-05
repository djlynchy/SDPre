import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.println("What is your first name?");
    String userInput = keyboard.nextLine();
    System.out.println("What is your last name?");
    String userInput1 = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String userInput2 = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String userInput3 = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String userInput4 = keyboard.nextLine();

    System.out.println("My name is "  +  userInput + userInput1 + ".");
    System.out.println("My favorite animal is "  +  userInput2 + ".");
    System.out.println("My favorite food is "  +   userInput3 + ".");
    System.out.println("My favorite song is "  + userInput4 + ".");


  }
}
