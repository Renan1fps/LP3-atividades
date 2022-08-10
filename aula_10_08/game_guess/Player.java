package aula_10_08.game_guess;

import java.util.Random;

public class Player {
  private Random random = new Random();
  private String namePlayer;

  public Player() {
  }

  public void setNamePlayer(String name) {
    this.namePlayer = name;
  }

  public String getNamePlayer() {
    return this.namePlayer;
  }

  public int getRandomNumber() {
    return random.nextInt(9);
  }
}
