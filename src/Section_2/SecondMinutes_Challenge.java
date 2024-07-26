package Section_2;

public class SecondMinutes_Challenge {
    public static void main(String[] args) {
     System.out.println(getDurationString(3600));
    }
    public static String getDurationString(int second){
    if(second < 0){
       return "Pls Provide Valid Second";
    }
    int minutes = second / 60;
    return getDurationString(second/60,second % 60);
    }
    public static String getDurationString(int minutes,int second){
        int hour = minutes/60;
        int remainingMinutes = minutes % 60;
        if(minutes <0){
            return "Pls Provide Valid Second";
        }
        if(second < 0 || second > 59){
            return "Pls Provide Valid Second";
        }

        return hour + "h "+ remainingMinutes + "m "+ second + "s";
    }
}
