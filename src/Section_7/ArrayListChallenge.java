package Section_7;
import java.util.*;

record GroceryItems(String name, String type,int count){

    public GroceryItems(String name){
        this(name,"DAIRY",1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class ArrayListChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<GroceryItem> itm = new ArrayList<>();
        itm.add(new GroceryItem("Milk"));
        System.out.println("Current List of Items: " + itm);
        System.out.println("Available actions: \n"+
                "0 - to shutdown \n" +
                "1 - to add item(s) to list (comma delimited list \n" +
                "2 - to remove any items (comma delimited list) \n" +
                "Enter a number for which action you want to do:");

        int input = s.nextInt();

        switch (input){
            case 0 -> System.out.println("It is Going to Be ShutDown");
            case 1 ->addItems(itm);
            case 2 ->removeItem(itm);
            default -> System.out.println("invalid Input");
        }


    }
    private static void addItems(ArrayList<GroceryItem> grocery){
        Scanner s = new Scanner(System.in);

        boolean isTrue = true;
         while(isTrue) {
             isTrue = false;
             System.out.print("Enter the Name Of Item: ");
             String name = s.nextLine();

             System.out.print("Enter the Type Of Item: ");
             String type = s.nextLine();

             int count = 0;
             boolean validCount = false;
             while (!validCount) {
                 System.out.print("How much " + name + " do you want to add? ");
                 try {
                     count = s.nextInt();
                     s.nextLine();  // Consume newline character left by nextInt()
                     validCount = true;
                 } catch (InputMismatchException e) {
                     System.out.println("Please enter a valid number.");
                     s.next();  // Clear the invalid input
                 }
             }

             grocery.add(new GroceryItem(name, type, count));
             System.out.println("Current List of Items: " + grocery);

             System.out.println("Do you want to add more items? (Y/N)");
             String come = s.nextLine().trim().toUpperCase();
             if (!come.equals("Y")) {
                 System.out.println("Do you want to Remove an items? (Y/N)");
                 String go = s.nextLine().trim().toUpperCase();

                 if(go.equals("Y")){
                     removeItem(grocery);
                 }else {isTrue = false;}

             }

         }
    }
    private static void removeItem(ArrayList<GroceryItem> grocery){
        Scanner s = new Scanner(System.in);
        System.out.println("Current List of Items: " + grocery );
        System.out.println("Enter The Name of The Item You want To Remove");
        String name = s.nextLine();

        if(grocery.contains(name)){
            grocery.remove(name);
        }

      else{
           System.out.println("There is no Such File");

       }

    }

}
