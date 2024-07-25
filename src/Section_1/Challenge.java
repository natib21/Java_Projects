package Section_1;

public class Challenge {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double total = ((num1 + num2) * 100) % 40.00d;
        boolean isTrue = (total == 0) ? true : false;
        System.out.println(isTrue);
        if(!isTrue){
            System.out.println("Got some remainder");
        }
    }
}
