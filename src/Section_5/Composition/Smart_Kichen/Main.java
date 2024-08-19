package Section_5.Composition.Smart_Kichen;

public class Main {
    public static void main(String[] args) {

         Appliances kichen = new Appliances();

         kichen.setKichenState(false,true,false);

         kichen.doKichenWork();
    }
}
