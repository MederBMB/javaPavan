package CollectionDemos;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Dog");
        l.add("Dog");
        l.add("Cat");
        l.add("Horse");
        l.add("Elephant");
        System.out.println(l); //[Dog, Dog, Cat, Horse, Elephant]

        //addFirst and addLast
        l.addFirst("Tiger");
        l.addLast("Lion");
        System.out.println("After adding: " + l); //[Tiger, Dog, Dog, Cat, Horse, Elephant, Lion]

        //getFirst and getLast
        System.out.println(l.getFirst()); //Tiger
        System.out.println(l.getLast());  //Lion

        //removeFirst and removeLast
        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first and last elements: " + l); //[Dog, Dog, Cat, Horse, Elephant]
    }
}
