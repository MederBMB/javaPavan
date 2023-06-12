package javaInterviewQuestions;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int a[] = {5, 2, 7, 9, 6};
        int sum = 0;

        //1) using For loop
        for (int i=0; i<5; i++){      //0 1 2 3 4     //a.length-1=4
            sum = sum + a[i];
        }
        System.out.println("Sum of Elements in Array is: "+sum);

        //2) using Enhanced For loop (For each loop)
        /*for(int value : a){
            sum = sum + value;
        }
        System.out.println("Sum of Elements in Array is: "+sum);*/
    }
}
