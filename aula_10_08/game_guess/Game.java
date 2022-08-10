package aula_10_08.game_guess;

import java.util.Random;

public class Game {
  Random random = new Random();
  private int randomNumber;

  public Game() {
  }

  public void startGame() {
    this.randomNumber = random.nextInt(9);
  }

  public int getRandomNumber(){
    return this.randomNumber;
  }
}
