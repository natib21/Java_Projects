package Section_4;

public class Customer {

    private String name;
    private int credit_limit;
    private String email;

    public Customer(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }
    public Customer(){
        this("Nathnael",20,"nathnaelzelalem@gmail.com");
    }

    public Customer(String name, String email){
        this(name,30,email);
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
