package Section_2;

public class Method_challenge {

    public static void main(String[] args) {
        displayHighScorePosition("Tim",calculateHighScorePosition(1500));
        displayHighScorePosition("Nati",calculateHighScorePosition(1000));
        displayHighScorePosition("Mike",calculateHighScorePosition(500));
        displayHighScorePosition("Teddy",calculateHighScorePosition(100));
        displayHighScorePosition("Roza",calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + " manged to get into position "+ playerPosition +" on the high score list");

    }
    public static int calculateHighScorePosition(int playerScore){
        int score ;
        if (playerScore >= 1000){
            score = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            score = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            score = 3;
        }else {
            score = 4;
        }
        return score;
    }
}
