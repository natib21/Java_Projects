package Section_7;

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
    }
    private static Double getDoubleObject(){
        return Double.valueOf(15);
    }

    private static double getLiteralDoublePrimitive(){
        return 10.00;
    }
}
