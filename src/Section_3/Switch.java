package Section_3;

public class Switch {
    public static void main(String[] args) {
        int val =1 ;
        switch (val) {
            case 1 -> System.out.println("Value is One");
            case 2 -> System.out.println("Value  is Two");
            default -> System.out.println("Value not 1 or 2");
        }
        String month = "apr";
      System.out.println(month + " is in the "+ getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month){
        switch (month) {
            case "jan", "feb", "Mar" -> {
                return  "1st ";
            }
            case "apr", "may", "jun" -> {
                return "2nd";
            }
            case "jul", "aug", "sep" -> {
                return "3rd ";
            }
            case "oct", "nov", "dec" -> {
                return "4th";
            }
        }
        return  "bad";
    }
}
