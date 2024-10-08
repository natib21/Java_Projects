package Section_3;

import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {

         int currentYear = 2022;
         try{
             System.out.println(getInputFromConsole((currentYear)));
         }catch(NullPointerException e){
             System.out.println(getInputFromScanner((currentYear)));
         }

    }
    public static  String getInputFromConsole(int currentYear){
        String Name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " +Name+ ", Thanks for taking the cour");
        String dateOfBirth = System.console().readLine("What Year Were You Born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you Are "+ age + " Year old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi,What Is Your Name");
        String name = sc.nextLine();

        System.out.println("Hi " +name+ ", Thanks for taking the course");

        System.out.println("What Year Were You Born? ");

        boolean validDob = false;
        int age = 0;

        do{
            System.out.println("Enter A year Of birth >= " + (currentYear - 125) +" and <= "+currentYear);
            try{
                age = checkData(currentYear, sc.nextLine());
                validDob = age < 0 ? false : true;
            }catch(NumberFormatException badUserData){
                System.out.println("Character Not Allowed!!! Try Again. ");
            }


        }while(!validDob);


        return "So you Are "+ age + " Year old";
    }
    public static int checkData(int currentYear , String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return  (currentYear - dob);
    }
}
