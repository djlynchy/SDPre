public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 0;

    do {
      counter = counter + 1;
      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      if(counter % 2 == 1) {
        System.out.println(counter + " is odd");
      }
    }while(counter <= 20);
  }
}
