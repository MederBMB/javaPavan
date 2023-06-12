package CollectionDemos;

import com.github.dockerjava.api.command.UpdateServiceCmd;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //Declare Linked List
        LinkedList l = new LinkedList();
        //LinkedList <Integer> l = new LinkedList<Integer>();
        //LinkedList <String> l = new LinkedList<String>();

        //Add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);  //[100, welcome, 15.5, A, true, null]
        System.out.println(l.size());   //6

        //remove
        l.remove(3);
        System.out.println("After removing, new list: " + l); //[100, welcome, 15.5, true, null]

        //insert/adding element in the middle of linked list
        l.add(3,"java");
        System.out.println("After inserting element: " + l); //[100, welcome, 15.5, java, true, null]

        //retriving value/object
        System.out.println(l.get(3)); //java

        //change the value
        l.set(5, "X");
        System.out.println("After changing the value: " + l); //[100, welcome, 15.5, java, true, X]

        //contains()
        System.out.println(l.contains("java"));  //true
        System.out.println(l.contains("python"));  //false

        //isEmpty()
        System.out.println(l.isEmpty()); //false

        //Reading elements from linked list using for loop
        /*for (int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }*/

        //Reading elements from linked list using for each loop
        /*for (Object e:l) {
            System.out.println(e);
        }*/

        //Reading elements from linked list using iterator() method
        Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
