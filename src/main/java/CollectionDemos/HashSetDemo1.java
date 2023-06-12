package CollectionDemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); //default capacity 16 Load Factor 0,75
        //HashSet hs = new HashSet(100);
        //HashSet hs = new HashSet(100,(float) 0.90);
        //HashSet <Integer> hs = new HashSet <Integer>();

        //add objects/elements into HashSet
        hs.add(100);
        hs.add("welcome");
        hs.add(16.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);  //[16.5, null, A, 100, welcome, true] ---> insertion order not preserved

        //remove()
        hs.remove(16.5); //value --->don't get index
        System.out.println("After removing element:"+hs); //[null, A, 100, welcome, true]

        //contains()
        System.out.println(hs.contains("welcome"));  //true
        System.out.println(hs.contains("hello"));    //false

        //isEmpty()
        System.out.println(hs.isEmpty()); //false

        //Reading objects/elements from hashset using for each loop
        /*for (Object e:hs){
            System.out.println(e);
        }*/

        //iterator()
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
