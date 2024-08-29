package Section_7;

import java.util.List;
import java.util.ArrayList;
public class MoreList {
    public static void main(String[] args) {
        String [] items = {"apples","bananas","milk","eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if(groceries.contains("mustard")){
            System.out.println("List Contains Mustard");
        }
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = "+ groceries.isEmpty());



    }
}
