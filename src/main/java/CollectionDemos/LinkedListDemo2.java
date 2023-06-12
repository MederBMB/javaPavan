package CollectionDemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList l2 = new LinkedList();
        l2.addAll(l);
        System.out.println(l2); //[X, Y, Z, A, B, C]

        l2.removeAll(l);
        System.out.println("After removing elements:"+l2); //[]

        //sort()   Collections.sort(collection)
        System.out.println("Before sorting: "+l); //[X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After sorting: " +l); //[A, B, C, X, Y, Z]
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse order: " + l); //Reverse order: [Z, Y, X, C, B, A]

        //shuffling
        Collections.shuffle(l);
        System.out.println("After shuffling: " +l); //[B, A, Y, Z, X, C]
    }
}
