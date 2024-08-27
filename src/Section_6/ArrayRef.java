package Section_6;

import java.util.Arrays;

public class ArrayRef {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray: "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray: "+Arrays.toString(anotherArray));
    }
}
