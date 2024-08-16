package Section_4.StringFormating;

public class Main {

    public static void main(String[] args) {

        String bulletin = "Print a Bulleted List: \n"+ "\t\u2022 First Point\n"+
                "\t\u2022 sub Point";

        System.out.println(bulletin);

        String textBlock = """
                Print a Bulletde List:
                         \u2022 First Point
                           \u2022 Sub Point
                      """;

        System.out.println(textBlock);

        int age = 25;
        System.out.printf("Your Age Is %d \n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth Year = %d\n",age, yearOfBirth);

        for (int i =1 ;i <= 100000; i *=10){
            System.out.printf("Printing %6d %n", i);
        }

        String formatedString = String.format("Your age is %d",age);
        System.out.println(formatedString);
    }
}
