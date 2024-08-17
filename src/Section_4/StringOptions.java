package Section_4;

public class StringOptions {
    public static void main(String[] args) {
         String helloWorld = "Hello"+" World";
       String me =  helloWorld.concat(" and Goodbye");
       System.out.println(me);
         printInformation(helloWorld);
         StringBuilder helloWorldBuilder = new StringBuilder("Hello" +" World");
         helloWorldBuilder.append(" and Goodbye");
         printInformation(helloWorldBuilder);
    }

    public  static void printInformation(String string){
        System.out.println("String = "+ string);

        System.out.println("Length = "+string.length());

    }
    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("length = "+builder.length());
    }
}
