package Section_7.Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOftheWeek dow = DayOftheWeek.SUN;
        System.out.println(dow);
        System.out.printf("Name is %s, Original Value = %d%n",dow.name(),dow.ordinal());

        for(int i =0; i< 6;i++){
            dow =getRandomDay();
//            System.out.printf("Name is %s, Original Value = %d%n",
//                    dow.name(),dow.ordinal());

//            if(dow == DayOftheWeek.SUN){
//                System.out.println("Found a Friday!!!");
//            }
            switchDayOfTheWeek(dow);
        }

    }

    public static DayOftheWeek getRandomDay(){
        int randomNumber = new Random().nextInt(DayOftheWeek.values().length);
        return DayOftheWeek.values()[randomNumber];
    }
    public static void switchDayOfTheWeek(DayOftheWeek dow){
        int weekDayInteger = dow.ordinal() + 1;
        switch (dow){
             case WED -> System.out.println("WED is Day "+ weekDayInteger);
             case THU -> System.out.println("THU is Day "+ weekDayInteger);
             default ->  System.out.println("Unknown Day "+ dow.name().charAt(0)+ dow.name().substring(1).toUpperCase()+
                    "day is Day "+weekDayInteger);
        }

    }
}
