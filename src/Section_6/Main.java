package Section_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] wish = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(wish));
        int [] reversed = reverse(wish);
        System.out.println(Arrays.toString(reversed));
        int [] reversedCopy = reverseCopy(wish);
        System.out.println(Arrays.toString(reversedCopy));
    }

    private static int[] reverse(int[] array) {
        int[] data = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            data[i] = array[(array.length - 1) - i];
        }
        return data;

    }
    private static int[] reverseCopy(int[] array){
        int[] data = new int[array.length];
        int maxLength = array.length - 1;

        for (int el: array){
            data[maxLength--] = el;
        }
        return  data;
    }
}
