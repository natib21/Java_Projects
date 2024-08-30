package Section_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayList {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"One");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

        originalList.sort(Comparator.reverseOrder());
        System.out.println("arrays: "+Arrays.toString(originalArray));

         //// ArrayList to Array
        ArrayList<String> stringList = new ArrayList<>(List.of("Jan","Feb","Mar"));
         String[] stringArray = stringList.toArray(new String[0]);

         System.out.println(Arrays.toString(stringArray));
    }
}
