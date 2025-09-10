package Section_6.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int [] val = readIntegers();
     System.out.println(Arrays.toString(val));
     int minVal = findMin(val);
     System.out.println(minVal);
    }
    public static  int[] readIntegers(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a list of integers, separated by commas: ");
        String num = s.nextLine();
        String[] splits = num.split(",");
        int[] val = new int[splits.length];
        for(int i = 0; i < splits.length; i++){
            val[i] = Integer.parseInt(splits[i].trim());
        }
        return val;
    }
    public static int findMin(int[] val){
        int min = val[0];
        for(int i = 1; i < val.length; i++){
            if(val[i] < min){
                min = val[i];
            }

        }
        return min;
    }
}
