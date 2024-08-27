package Section_6;

public class VarArgs {
    public static void main(String... args) {
    System.out.println("Hello World Again");
    String[] splitString = "Hello World Again".split(" ");
    printText(splitString);

    System.out.println("_".repeat(20));
    printText("Hello","Nati");
    System.out.println("_".repeat(20));
    printText("Hello","World","Again");
    System.out.println("_".repeat(20));
    printText();
    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}
