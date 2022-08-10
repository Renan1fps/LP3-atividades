package atividade_02.q2;

public class Fatura {

  private int numeroItem;
  private String descricaoItem;
  private int quantidadeItem;
  private double precoUnitarioItem;

  public Fatura(int numeroItem, String descricaoItem, int quantidadeItem, double precoUnitarioItem) {
    this.numeroItem = numeroItem;
    this.descricaoItem = descricaoItem;
    this.quantidadeItem = quantidadeItem < 0 ? 0 : quantidadeItem;
    this.precoUnitarioItem = precoUnitarioItem < 0 ? 0.0 : precoUnitarioItem;
  }

  public double getValorFatura() {
    double valorFatura = this.quantidadeItem * precoUnitarioItem;
    return valorFatura;
  }

}
