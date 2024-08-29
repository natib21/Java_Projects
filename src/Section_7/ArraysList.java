package Section_7;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type,int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }
}
public class ArraysList {
    public static void main(String[] args) {
         GroceryItem[] groceryArray = new GroceryItem[3];
         groceryArray[0] = new GroceryItem("Milk");
         groceryArray[1] = new GroceryItem("Apples","PRODUCE",6);
         groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
         System.out.println(Arrays.toString(groceryArray));

        ArrayList obj = new ArrayList();

        ArrayList<GroceryItem>  obje= new ArrayList<>();
        obje.add(new GroceryItem("butter"));

    }
}
