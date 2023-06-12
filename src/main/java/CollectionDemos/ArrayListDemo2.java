package CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup); //[X, Y, Z, A, B, C]

        al_dup.removeAll(al);
        System.out.println("After removing: " + al_dup); //After removing:[]

        //Sort ----> Collections.sort()
        System.out.println("Elements in the arraylist: " + al); //[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println("Elements in the arraylist after sorting: " + al); //[A, B, C, X, Y, Z]
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the arraylist after sorting in reverse order: " + al); //[Z, Y, X, C, B, A]
        //Shuffling - Collections
        Collections.shuffle(al);
        System.out.println("Elements in the arraylist after shuffling: " + al); //[C, Z, X, Y, B, A]
    }
}
