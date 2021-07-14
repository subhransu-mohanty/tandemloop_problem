import java.util.Scanner;

class Numberseries {

  public static void main(String args[]) {
    int result;
    System.out.println("Enter number:a=");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int i;
    do {
      for (i = 0; i <= number; i++) {
        if (i % 2 != 0) {
          result = i;
          System.out.println(result);
        }
      }
    } while (i <= number);
  }
}
