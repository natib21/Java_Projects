package Section_2;

public class Expression {
    public static void main(String[] args) {
      boolean gameOver = true;
      int score = 800;
      int levelComplete = 5;
      int bonus = 100;
      if (score < 5000 && score > 1000){
           System.out.println("Your Score Was less than 5000 but greater than 1000");
       }else if(score < 1000) {
           System.out.println("Your Score Was less than 1000");
       }else {
           System.out.println("Got here");
       }
    }
}