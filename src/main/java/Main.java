import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Welcome to the calculator");

    while(true) {

      System.out.println("Enter a command: ");
      Scanner scanner = new Scanner(System.in);
      String incomingOperation = scanner.nextLine();

      String[] input = incomingOperation.split(" ");
      switch (input[0]) {
        case "add":
          System.out.println(calculator.add(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        case "subtract":
          System.out.println(calculator.subtract(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        case "multiply":
          System.out.println(calculator.multiply(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(input[1])));
          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(input[1])));
          break;
      }
    }
  }
}