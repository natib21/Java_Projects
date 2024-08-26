package Section_6;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
   int [] firstArray = getRandomArray(10);
   System.out.println(Arrays.toString(firstArray));
   Arrays.sort(firstArray);
   System.out.println(Arrays.toString(firstArray));

   int [] thirdArray = getRandomArray(10);
   System.out.println(Arrays.toString(thirdArray));

   int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
   System.out.println(Arrays.toString(fourthArray));

   Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

   String[] sArray = {"Able","Jane","Mark","Ralph","David"};
    Arrays.sort(sArray);
    System.out.println(Arrays.toString(sArray));
    if(Arrays.binarySearch(sArray,"Mark") >= 0){
        System.out.println("Found Mark In The List");
    }

    int[] s1 ={1,2,3,4,5};
    int[] s2 = {1,2,3,4,5};

    if(Arrays.equals(s1,s2)){
        System.out.println("Arrays are equal");
    }


    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0 ; i< len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
