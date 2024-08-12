package Section_4;

public class ClassChallenge {
    public static void main(String[] args) {

        AccountClass sl = new AccountClass();

        sl.setName("Nathnael Zelalem");
        sl.setPhone_number(923479921);
        sl.setEmail("nathnaelzelalem@gmail.com");
        sl.setAccount_number(122121);
        sl.setAccount_balance(10000);

        sl.Withdraw(100000);
        sl.Account();
    }
}
