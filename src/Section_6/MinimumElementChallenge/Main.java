package Section_6.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ;

         System.out.println(readIntegers());
    }
    public static   int[] readIntegers(){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String[] splits = num.split(",");
        int[] val = new int[splits.length];
        for(int i = 0; i < splits.length; i++){
            val[i] = Integer.parseInt(splits[i].trim());
        }
        return val;

    }
}
