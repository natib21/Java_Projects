package Section_4;

public class CustomerMain {

    public static void main(String[] args) {

        Customer nati = new Customer();
        System.out.print("Nama : "+nati.getName() + "\n" +
                         "Email : "+ nati.getEmail() + "\n"+
                         "Credit_Limit : "+ nati.getCredit_limit() + "\n ////// ////// /// ");


        Customer man = new Customer("Man","man@gmail.com");
        System.out.print("\nNama : "+man.getName() + "\n" +
                "Email : "+ man.getEmail() + "\n"+
                "Credit_Limit : "+ man.getCredit_limit() + "\n ////// ////// /// ");

    }
}
