package atividade_02.q2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.##");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero do item: ");
    int numeroItem = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite a descrição do item: ");
    String descricaoItem = scanner.nextLine();

    System.out.println("Digite o quantidade do item: ");
    int quantidadeItem = scanner.nextInt();

    System.out.println("Digite o preco unitario do item: ");
    double precoUnitarioItem = scanner.nextDouble();

    Fatura fatura = new Fatura(numeroItem, descricaoItem, quantidadeItem, precoUnitarioItem);

    double valorFatura = fatura.getValorFatura();

    System.out.println("O valor da fatura é de: " + df.format(valorFatura));

    scanner.close();

  }
}
