package Section_4.InheritanceChallenge;

public class SalaridEmployee extends Employee {


     double annualSalery;
     boolean isRetired;

    public SalaridEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalery) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalery = annualSalery;

    }

    @Override
    public double collectPay(){
        double paycheck = annualSalery / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retired(){
        terminate("12/12/2025");
        isRetired =true;
    }
}
