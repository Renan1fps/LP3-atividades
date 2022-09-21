package atividade_02.q3;

public class Carteira {

  private double saldo;

  public Carteira(double saldo) {
    this.saldo = saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public boolean podePegar(double valor) {
    if (valor > this.saldo) {
      return false;
    }

    return true;
  }
}
