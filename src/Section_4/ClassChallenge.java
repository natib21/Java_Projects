package Section_4;

public class ClassChallenge {
    public static void main(String[] args) {

      AccountClass sc = new AccountClass();

        System.out.println(sc.getAccount_number());

        AccountClass bob = new AccountClass(43242,"nathnaelzelalem@gmail.com","Nati");

        System.out.println(bob.getAccount_balance());
        System.out.println(bob.getAccount_number());
    }
}
