package Section_3;

public class EnhancedSwitch {
    public static void main(String[] args) {
        int day =0;
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

    }
    public static void printDayOfWeek(int day){
       String daysOfWeek =  switch (day){
            case 0 -> "Monday";
            case 1 -> "TuesDay";
            case 2 -> "WensDay";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid Day";

        };
System.out.println(day + " stands for "+ daysOfWeek);
    }
}
