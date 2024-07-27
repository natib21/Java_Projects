package Section_3;

public class Traditional_Switch {
    public static void main(String[] args) {
     char letter = 'x';
        switch (letter){
            case 'A':
                System.out.println("Abie");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            default:
                System.out.println("Not Found");
        }
    }

}
