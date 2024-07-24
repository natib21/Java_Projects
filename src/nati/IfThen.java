package nati;

public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (!isAlien){
            System.out.println("It Is Not Alien");
        }
        int secondTopScore = 20;
        int topScore = 60;
        if((topScore >secondTopScore) && (topScore < 100) ){
            System.out.print("Greater Than second top score and less than 100");
        }
        String makeofCar = "volkswagen";

        boolean isDomestic = (makeofCar == "volkswagen") ? false : true;
        if(isDomestic){
            System.out.println("this car is domestic to our country");
        }
    }
}
