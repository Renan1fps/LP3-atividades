package aula_10_08.dog;

public class OwnerDog {

  private Cao dog;
  private String nameOwner;

  public OwnerDog(Cao dog, String nameOwner) {
    this.dog = dog;
    this.nameOwner = nameOwner;
  }

  public Cao getCao() {
    return this.dog;
  }

  public String getNameOwner() {
    return this.nameOwner;
  }

}
