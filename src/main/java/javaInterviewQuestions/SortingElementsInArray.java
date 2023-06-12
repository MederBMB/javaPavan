package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {
    public static void main(String[] args) {
        //1) using Arrays.parallelSort()
        /*int a[] = {30, 50, 20, 10, 60};
        System.out.println("Array elements before sorting: "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array elements after sorting: "+ Arrays.toString(a));*/

        //2) using Arrays.sort()
        /*int a[] = {30, 50, 20, 10, 60};
        System.out.println("Array elements before sorting: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array elements after sorting: "+ Arrays.toString(a));*/

        //Reverse Descending order
        Integer a[] = {30, 50, 20, 10, 60};
        System.out.println("Array elements before sorting: "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());  //--->NOT support primitive data types (int-->Integer)
        System.out.println("Array elements after sorting: "+ Arrays.toString(a));
    }
}
