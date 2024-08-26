package Section_6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,3,4,5};


        for(int i =0 ; i< myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }

        int[] firsTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = "+ firsTen[0]);
        int arrayLength = firsTen.length;
        System.out.println("Length Of array = "+arrayLength);
        System.out.println("last = "+firsTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[5];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = newArray.length - i;
            System.out.print(newArray[i]+ " " );
        }
        System.out.println(" ");
        for(int e : newArray){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("ObjectVariable is really an int array");
        }
    }
}
