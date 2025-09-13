package Section_7;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListT {

    public static void main(String[] args) {
//        LinkedList<String> placeToVisit = new LinkedList<>();

    var placeToVisit = new LinkedList<String>();

    placeToVisit.add("USA");
    placeToVisit.add(0,"ENGLAND");
    System.out.println(placeToVisit);
    addMoreElements(placeToVisit);
    System.out.println(placeToVisit);
    removeElements(placeToVisit);
    System.out.println(placeToVisit);
//    getElements(placeToVisit);
//   printItinerary2(placeToVisit);
        testiterator(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        list.offer("Madrid");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        list.push("Alicia");
    }

    private static void removeElements(LinkedList<String> list){
        String s1 = list.remove();
        System.out.println(s1 +" was removed");

        String s4 = list.removeLast();
        System.out.println(s1 +" was removed");

        String s2 = list.poll();
        System.out.println(s2 + " was removed");

        String s3 = list.pollLast();
        System.out.println(s3 + " was removed");
    }

    private static void getElements(LinkedList<String> list){
         System.out.println("Retrieved Element = "+ list.get(3));
        System.out.println("First Element = "+ list.getFirst());
        System.out.println("Last Element = "+ list.getLast());

        System.out.println("Darwin is at position = "+ list.indexOf("Darwin"));

        System.out.println("Melbourne is at position  = "+ list.lastIndexOf("USA"));

        System.out.println("Element from Element() = "+ list.element());

        System.out.println("Element from peek() = "+ list.peek());
        System.out.println("Element from peekFirst() = "+ list.peekFirst());
        System.out.println("Element from peekLast() = "+ list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip Starts at = "+ list.getFirst());
        for(int i =1 ; i<list.size(); i++){
            System.out.println("--> From: "+list.get(i-1) + " to "+ list.get(i));
        }

        System.out.println("Trip Ends at = "+ list.getLast());

    }
    public static void printItinerary1(LinkedList<String> list){
        System.out.println("Trip Starts at = "+ list.getFirst());
        String prevTown = list.getFirst();
        for(String el : list){
          System.out.println("--> From "+ prevTown + " to "+ el);
          prevTown = el;
        }

        System.out.println("Trip Ends at = "+ list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip Starts at = "+ list.getFirst());
        String prevTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var el = iterator.next();
            System.out.println("--> From "+ prevTown + " to "+ el);
            prevTown = el;
        }

        System.out.println("Trip Ends at = "+ list.getLast());
    }

    private static void testiterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("ENGLAND")){
                iterator.add("Lake Victoria");
            }
        }

        System.out.println(list);
    }
}
