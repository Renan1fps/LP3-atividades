package atividade_02.q1;

public class Radio {
  private int volume;
  private double frequencia;

  public Radio(int volume, double frequencia) {
    this.volume = volume;
    this.frequencia = frequencia;
  }

  public int getVolume() {
    return this.volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public double getFrequencia() {
    return this.frequencia;
  }

  public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
  }

  public void mostraFrequenciaEVolume() {
    System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n Frequencia: " + this.frequencia);
    System.out.println("\n Volume: " + this.volume);
  }
}
