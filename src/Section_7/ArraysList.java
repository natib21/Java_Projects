package Section_7;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type,int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
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

        ArrayList<GroceryItem>  obje= new ArrayList<GroceryItem>();
        obje.add(new GroceryItem("butter"));
        obje.add(new GroceryItem("Milk"));
        obje.add(new GroceryItem("oranges","PRODUCE",5));
        obje.set(0,new GroceryItem("apples","PRODUCE",6));
        obje.remove(1);
         System.out.println(obje);
    }
}
