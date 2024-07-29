package Section_3;

public class WhileLoopChallenge {
    public static void main(String[] args) {
     int num = 4;
     int count= 0;
     int odd = 0;
     while(num <= 20){
         num++;
         if(!isEvenNumber(num)){
             odd++;
             continue;
         }
         System.out.println(num);
         count +=1;
         if(count == 5){
             break;
         }
     }
     System.out.println("number of even "+count);
        System.out.println("number of odd "+odd);
    }
    public static boolean isEvenNumber(int num){
        return (num % 2 == 0);
    }
}
