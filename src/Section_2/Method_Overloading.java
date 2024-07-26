package Section_2;

public class Method_Overloading {
    public static void main(String[] args) {
    double totalHeight = convertToCentimeters(5,8);
    System.out.println(totalHeight + "cm");
    }

    public static double convertToCentimeters(int heightInInches){
        return  heightInInches * 2.54;
    }
    public static double convertToCentimeters(int heightInFeet,int heightInInches){
       return convertToCentimeters((heightInFeet * 12)+heightInInches);
    }
}
