package aula_10_08.dog;

public class Cao {
  private String nameDog;
  private int lengthDog;

  public Cao() {

  }

  public void setNameDog(String name) {
    this.nameDog = name;
  }

  public String getNameDog() {
    return this.nameDog;
  }

  public void setLengthDog(int length) {
    this.lengthDog = length;
  }

  public int getLengthDog() {
    return this.lengthDog;
  }

  public void bark() {
    System.out.println("\nAU AU");
  }

  public void loadDog() {
    System.out.println("\nThe name of dog is: " + this.nameDog);
    System.out.println("\nThe length of dog is: " + this.lengthDog);
  }
}
