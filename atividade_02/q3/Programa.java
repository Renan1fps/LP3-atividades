package atividade_02.q3;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor a sacar: ");
    double valor = scanner.nextInt();

    Carteira carteira = new Carteira(100.00);

    boolean sacouDinuheiro = carteira.podePegar(valor);

    if (!sacouDinuheiro) {
      System.out.println("Saldo insuficiente para saque");
    } else {
      System.out.println("Dinheiro sacado com sucesso!");
    }

    scanner.close();
  }
}
