package Section_3;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
     double number = 0;
    double sum =0 ;
        do{
            try{
                System.out.println("Enter number # "+num);
                number = Double.parseDouble(sc.nextLine());
                sum +=number;
            }catch(NumberFormatException e){

               System.out.println("Invalid Number");

            }
            num++;
        }while(num <= 5);
System.out.println(sum);
    }
}
