import java.util.Scanner;

class Calculator {

  public static void main(String args[]) {
    char operator;
    Double a, b;
    Double result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an Operator  + , - , * ,/ ");
    operator = sc.next().charAt(0);
    System.out.println("Enter First Number:");
    a = sc.nextDouble();
    System.out.println("Enter Second Number:");
    b = sc.nextDouble();
    switch (operator) {
      case '+':
        result = a + b;
        System.out.println(result);
        break;
      case '-':
        result = a - b;
        System.out.println(result);
        break;
      case '*':
        result = a * b;
        System.out.println(result);
        break;
      case '/':
        result = a / b;
        System.out.println(result);
        break;
      default:
        System.out.println("Invalid Operator");
        break;
    }
  }
}
