package Section_3;

public class TheForLoopChallenge {
    public static void main(String[] args) {
        int primeNumberCounter = 0;
        for(int counter = 1; counter <= 1000 ; counter++){
            if(isPrime(counter)){
                System.out.println("number "+counter +" is a Prime Number");
                primeNumberCounter++;
                if(primeNumberCounter == 3){
                    break;
                }
            }

        }

        System.out.println("I Found "+primeNumberCounter +" Prime Numbers");
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
               return (wholeNumber == 2);
        }
        for (int divisor = 2;divisor <wholeNumber;divisor++){
            if(wholeNumber % divisor == 0){
                return  false;
            }
        }
        return true;
    }
}
