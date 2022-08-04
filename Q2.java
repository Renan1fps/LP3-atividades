import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    int input;
    int firstNumber = 0;
    int secondNumber = 1;
    int sequential;

    try {
      System.out.println("Digite um número: ");
      input = scanner.nextInt();

      System.out.println("Sequencia de  Fibonacci:  ");
      System.out.print("0 1");
      while (secondNumber <= input) {
        sequential = secondNumber + firstNumber;
        System.out.print(" " + sequential);
        firstNumber = secondNumber;
        secondNumber = sequential;
      }
      System.out.print("\n");
      scanner.close();

    } catch (InputMismatchException e) {
      System.out.println("Argumento inválido para o tipo numérico");
    }
  }

}
