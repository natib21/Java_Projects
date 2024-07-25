public class Expression_challenge {
    public static void main(String[] args) {
      boolean gameOver = true;
      int score = 800;
      int levelComplete = 5;
      int bonus = 100;

      int finalScore = score;

      if (gameOver){
          finalScore += (levelComplete * bonus);
          System.out.println("Your final score was " + finalScore);
      }

      score = 10000;
      levelComplete = 8;
      bonus = 200;
      finalScore = score;
      if(gameOver){
          finalScore += (levelComplete * bonus);
          System.out.println("Your final score was " + finalScore);
      }

    }
}