package Section_4;

public class AccountClass {


     private int Account_number;
     private int Account_balance;
     private String Name;
     private String Email;
     private int Phone_number;

    public int getAccount_number() {
        return Account_number;
    }

    public int getAccount_balance() {
        return Account_balance;
    }
    public AccountClass() {
        this(221133,5000,"Picolo","picolozelalem@gmail.com",911413623);
        System.out.println("Empty Constructor are Called");
    }
    public AccountClass(int Account_number , int Account_balance , String Name,String Email,int phone_number ){
        System.out.println("Account constructor with parameter called");
        this.Account_number =Account_number;
        this.Account_balance = Account_balance;
        this.Name =Name;
        this.Email = Email;
        this.Phone_number = phone_number;

    }

    public AccountClass(int phone_number, String email, String name) {
        this(89232,3000,name,email,phone_number);
        Phone_number = phone_number;
        Email = email;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setAccount_number(int account_number) {
       this.Account_number = account_number;
    }

    public void setAccount_balance(int account_balance) {
        this.Account_balance = account_balance;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setEmail(String email) {
        this. Email = email;
    }

    public void setPhone_number(int phone_number) {
        this.Phone_number = phone_number;
    }

    public void Deposit(int ammount){
       this.Account_balance += ammount;
    }
    public void Withdraw(int ammount){

        if(ammount > this.Account_balance){
            System.out.print("pls recharge your account!!!");
        }else{
            this.Account_balance -=ammount;
        }

    }

    public void Account(){
        System.out.print(
                   "Name :"+ Name
                +"\nphone Number :"+ Phone_number
                +"\n Email :"+ Email
                +"\n Account Number :"+ Account_number
               +"\n Balance :"+ Account_balance
        );
    }
}
