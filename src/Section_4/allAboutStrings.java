package Section_4;

public class allAboutStrings {
    public static void main(String[] args) {
        // Inspection String
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";

        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n",helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l'));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Value Match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value Match ignore Case");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("it Start with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("it ends with World ");
        }
        if(helloWorld.contains("World")){
            System.out.println("it contains");
        }
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n",length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is Blank");

        }
        System.out.printf("First char  %c %n",string.charAt(0));

        System.out.printf("Last char = %c %n",string.charAt(length - 1));
    }
}
