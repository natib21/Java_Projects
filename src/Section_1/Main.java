package Section_1;

public class Main {
    public static void main(String[] args) {
     printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.print("Invalid Value");
            return;
        }
       long hour = minutes / 60;
        long day = minutes % 60;
        System.out.println(hour + ":" + day);
    }
}