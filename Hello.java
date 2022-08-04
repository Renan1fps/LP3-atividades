import java.util.Random;
import java.util.Scanner;

public class Hello {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(100);

    System.out.println("Número: " + randomNumber);

    int input = 0;
    boolean condition = true;

    while (condition) {
      System.out.println("Digite um número: ");
      input = scanner.nextInt();

      if (input < randomNumber) {
        System.out.println("MAIOR");
      }

      if (input > randomNumber) {
        System.out.println("MENOR");
      }

      if (input == randomNumber) {
        System.out.println("Acertou, o número é: " + randomNumber);
        condition = false;
      }
    }

    scanner.close();
  }
}