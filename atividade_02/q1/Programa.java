package atividade_02.q1;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o volume: ");
    int volume = scanner.nextInt();

    System.out.println("Digite a frequencia: ");
    double frequencia = scanner.nextDouble();

    Radio radio = new Radio(volume, frequencia);

    radio.mostraFrequenciaEVolume();

    scanner.close();
  }
}
