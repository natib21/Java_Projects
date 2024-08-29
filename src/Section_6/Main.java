package Section_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] wish = {1,2,3,4,5};
    System.out.println(Arrays.toString(wish));
    wish = reverse(wish);
    System.out.println(Arrays.toString(wish));
    }
    private static int[] reverse(int[] array){
        int [] data = new int[array.length];
        int temp = array.length - 1 ;
//        for(int i=0;i<array.length;i++){
//            temp = array[i];
//            array[i] = array[(array.length-1) - i];
//            array[(array.length-1)-i]= temp;
//            data[i]= array[i];
//        }
        for(int el : array){
            data[temp--] = el;
        }
        return  data;

    }
}
