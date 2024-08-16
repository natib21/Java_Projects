package Section_4.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee nati = new Employee("Nathnael","03/12/1996","09/32/2345","09/23/1932");
        SalaridEmployee joe = new SalaridEmployee("Joe Biden","12/04/1995","09/32/2050","09/23/1932",50000);

        System.out.println(joe);
        System.out.println(joe.collectPay());

        joe.retired();
        System.out.println(joe.collectPay());
    }
}
