package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Declare ArrayList    ----> объявить ArrayList
        // ArrayList<Integer> al = new ArrayList<Integer>();
        //ArrayList<String> al = new ArrayList<String>();
        //List al = new ArrayList();
        ArrayList al = new ArrayList();

        //Add new elements to the arraylist
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al); //[100, Welcome, 15.5, A, true]

        //size()
        System.out.println("Number of elements in arraylist: " + al.size()); //Number of elements in arraylist: 5

        //remove()
        al.remove(1); //here 1 is index
        //al.remove("welcome"); //here welcome is element
        System.out.println("After removing element from arraylist: " +al); //[100, 15.5, A, true]

        //insert a new element
        //add (index, object)
        al.add(2, "Python");
        System.out.println("After insertion: " + al); //After insertion: [100, 15.5, Python, A, true]

        //retrieve specific element  --->  получить определенный элемент
        System.out.println(al.get(2)); //Python, here 2 is index of element/object

        //change element/replace
        al.set(2, "C#");
        System.out.println("After replacing element:" + al); //After replacing element:[100, 15.5, C#, A, true]

        //search - contains() ---> return true/false
        System.out.println(al.contains("C#")); //true
        System.out.println(al.contains("C++")); //false

        //isEmpty() ---> return true/false
        System.out.println(al.isEmpty()); //false

        //3 approaches to read elements in arraylist
        //1)for loop
        System.out.println("Reading elements using for loop");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        //2)for each loop
        System.out.println("Reading elements using for each loop");
        for(Object e:al){
            System.out.println(e);
        }

        //3)iterator
        System.out.println("Reading elements using iterator method");
        Iterator it = al.iterator();
        while (it.hasNext()){      //method will check "has it next element?" while answer is true
            System.out.println(it.next()); //printing the element and move to next
        }
    }
}
