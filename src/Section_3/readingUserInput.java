package Section_3;

public class readingUserInput {
    public static void main(String[] args) {

         int currentYear = 2022;
         System.out.println(getInputFromConsole((currentYear)));
    }
    public static  String getInputFromConsole(int currentYear){
        String Name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " +Name+ ", Thanks for taking the cour");
        String dateOfBirth = System.console().readLine("What Year Were You Born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you Are "+ age + " Year old";
    }
}
