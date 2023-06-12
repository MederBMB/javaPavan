package CollectionDemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        String arr [] = {"Dog", "Cat", "Elephant"};
        for(String value : arr){
            System.out.println(value); //Dog
                                       //Cat
                                       //Elephant
        }
        //How to convert a given array in arraylist
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);  //[Dog, Cat, Elephant]
    }
}
