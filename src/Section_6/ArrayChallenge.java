package Section_6;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int field [] = getRandomGenratedNum(10);
        System.out.println(Arrays.toString(field));

        Arrays.sort(field);
        System.out.println(Arrays.toString(field));

         int temp;
         boolean flag = true;
         while (flag) {
            flag = false;
             for (int i = 0; i < field.length - 1; i++) {
                 if (field[i] < field[i + 1]) {
                     temp = field[i];
                     field[i] = field[i + 1];
                     field[i + 1] = temp;
                     flag = true;
                 }
             }
         }
         System.out.println(Arrays.toString(field));
    }
    public static int[] getRandomGenratedNum(int num){
        int [] number = new int[num];
        Random random = new Random();
        for(int i =0 ; i < num ; i++){
            number[i] = random.nextInt(100);
        }
        return number;
    }
}
