package Section_7;

import java.util.Arrays;
import java.util.ArrayList;
public class AutoBoxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
//        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unBoxing = boxedInt.intValue();

      Integer autoBoxed  = 15;
      int autoUnboxed = autoBoxed;
      System.out.println(autoBoxed.getClass().getName());

      Double resultBoxed = getLiteralDoublePrimitive();
      double resultUnboxing = getDoubleObject();

//      System.out.println(autoUnboxed.getClass().getName());

        Integer[] boxInt = new Integer[5];
        boxInt[0] = 50;
        System.out.println(boxInt.getClass().getName());
        Character[] name = {'a','b','c','d'};
        System.out.println(Arrays.toString(name));

        var outList = gotList(1,2,3,4,5);
        System.out.println(outList);
    }

    private static ArrayList<Integer> gotList(int... varargs){
        ArrayList<Integer> lists = new ArrayList<>();
        for(int i : varargs){
            lists.add(i);
        }
        return lists;
    }
    private static int returnAnInt(Integer val) {
        return val;
    }
    private static Integer returnAnInt(int val){
        return val;
    }
    private static Double getDoubleObject(){
        return Double.valueOf(15);
    }

    private static double getLiteralDoublePrimitive(){
        return 10.00;
    }
}
