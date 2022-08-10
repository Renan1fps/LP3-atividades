package aula_10_08.dog;

public class index {
  public static void main(String[] args) {
    Cao dog = new Cao();

    dog.setLengthDog(10);
    dog.setNameDog("dog louco");

    OwnerDog ownerDog = new OwnerDog(dog, "Renan");

    System.out.println("O nome do dog do cachorro é: " + ownerDog.getNameOwner());
    System.out.println("\nseu cachorro é: " + ownerDog.getCao().getNameDog());
  }
}
