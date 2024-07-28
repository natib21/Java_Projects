package Section_3;

public class TheForLoop {
    public static void main(String[] args) {
        for(int num =  1; num <= 10 ; num++){
            System.out.println(num);
        }
        for(double rate = 7.5 ; rate <= 10.0; rate += 0.25){
            if(rate > 8.5) break;
            double interestAmount = calculateInterest(100,rate);
            System.out.println("$100 at "+rate +" % interest "+interestAmount);
        }
    }
    public static double calculateInterest(double amount,double interstRate){
        return (amount*(interstRate/100));
    }
}
