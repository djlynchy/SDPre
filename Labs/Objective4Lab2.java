import java. util.Scanner;
public class Objective4Lab2  {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    System.out.println("Please enter the first whole number you would like to add.");
    int userInput = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
int userInput1 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
int userInput2 = keyboard.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
double doubleInput = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
double doubleInput1 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
double doubleInput2 = keyboard.nextDouble();
    System.out.println("The sum of " + userInput + " + " + userInput1 + " + " +  userInput2  + " = " + (userInput + userInput1 + userInput2));
    System.out.println("The sum of " + doubleInput + " + " + doubleInput1 + " + " + doubleInput2  + " = " + (doubleInput + doubleInput1 + doubleInput2));

  }
}
