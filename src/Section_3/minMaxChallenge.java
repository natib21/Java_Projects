package Section_3;

import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        int min =0;
        int max = 0;
        while(isValid){


            try {
                System.out.println("pls Enter a Number, type any character to quit  ");
              int user = Integer.parseInt(sc.nextLine());
                if(user < min){
                    min = user ;
                }
                if(user > max){
                    max = user;

                }


            }catch(NumberFormatException e){
                isValid = false;
            }
        }
        System.out.println("The Max Val :" + max +" \n The Min Val : " + min);

    }
}
