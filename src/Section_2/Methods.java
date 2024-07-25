package Section_2;

public class Methods {
    public static void main(String[] args) {
      int highScore = calculateScore(true,800,5,100);
      System.out.println("The High Score "+highScore);
      System.out.println("The Next highScore Is "+
      calculateScore(true,10000,8 , 200));

    }
    public static int calculateScore(boolean gameOver,int score , int levelComplete, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelComplete * bonus);
            finalScore += 1000;

        }
        return finalScore;
    }
}