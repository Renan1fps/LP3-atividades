package aula_10_08.game_guess;

public class Index {
  public static void main(String[] args) {

    final int LENGTH_PLAYERS = 3;
    boolean conditionLoop = true;

    Game gamer = new Game();
    gamer.startGame();

    System.out.println("O numero do game é: " + gamer.getRandomNumber());

    Player[] players = new Player[LENGTH_PLAYERS];

    for (int i = 0; i < LENGTH_PLAYERS; i++) {
      players[i] = new Player();
    }

    int accountant = 0;
    while (conditionLoop) {
      if (accountant == 3) {
        accountant = 0;
      }

      int number = players[accountant].getRandomNumber();
      System.out.println("\n O numero escolhido pelo jogador " + accountant + " foi: " + number);

      if (number == gamer.getRandomNumber()) {
        System.out.println("\n O jogador " + accountant + " acerto o numero");
        conditionLoop = false;
        break;
      }

      accountant++;
    }
  }
}

/*
 * for (int i = 0; i < LENGTH_PLAYERS; i++) {
 * int numberPlayer = players[i].getRandomNumber();
 * System.out.println("Numero que o player");
 * 
 * if(numberPlayer == gamer.getRandomNumber()){
 * System.out.println("O jogador " + i + " acertou o número");
 * conditionLoop = false;
 * break;
 * }
 * }
 */
