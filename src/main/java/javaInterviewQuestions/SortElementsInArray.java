package javaInterviewQuestions;

import java.util.Arrays;

public class SortElementsInArray {
    public static void main(String[] args) {
        int a[] = {40, 2, 1005, 5, 3};
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        int n = a.length;

        for (int i=0; i<n-1; i++){            //Number of passes
            for (int j=0; j<n-1; j++){        //Iterations in each pass
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(a));
    }
}
