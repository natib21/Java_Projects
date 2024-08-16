package Section_4.InheritanceChallenge;

public class Worker {

    protected String name;
    protected  String birthDate;
    protected  String endDate;

    public Worker(){}

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
         int currentYear = 2024;
         int birthYear = Integer.parseInt(birthDate.substring(6));

         return (currentYear - birthYear);
    }
    public double collectPay(){
       return 0.0;
    }
    public void terminate(String endDate){
       this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
