package swap;

import java.util.Arrays;

public class Swap {
    public static void main(String args[]){
        //Initialising the Array we are going to work with.
        String[] names = new String[]{"John","Alan", "Steve", "Sarah", "Eric"};
        //Calling the method in the main
        swap(names, 1,3);
    }
    //Creating a generic swap method
    public static <E> void swap(E[] Array, int index, int indexTwo){
        //Code to swap the to string at the correct index
        E e = Array[index];
        Array[index] = Array[indexTwo];
        Array[indexTwo] = e;
        //Outputting the new Array after swap
        System.out.println(Arrays.toString(Array));



    }
}






