package Section_3;

public class Sum3and5Challenge {
    public static void main(String[] args) {
        int Sum = 0;
        int count =0;
        for (int i=1; i<=1000;i++){
            if((i % 3 == 0 && i % 5 == 0)) {
                Sum += i;
                count++;
                if(count == 5) break;
            }
        }
        System.out.println("sum = "+ Sum);
    }
}
