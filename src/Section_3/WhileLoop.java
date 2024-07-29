package Section_3;

public class WhileLoop {
    public static void main(String[] args) {
        int j = 1;
        boolean isReady = false;
        do{
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        }while(isReady);
    }
}
