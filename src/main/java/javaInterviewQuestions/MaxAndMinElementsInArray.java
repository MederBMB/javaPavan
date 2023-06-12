package javaInterviewQuestions;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {

        //Find Maximum element in array
        int a[] = {50, 30, 40, 20, 60};

        int max = a[0];

        for(int i=1; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in array is: "+ max);

        //Find Minimum element in array
        int a1[] = {50, 100, 40, 20, 60};
        int min = a1[0];

        for(int i=1; i<a1.length; i++){
            if (a1[i]<min){
                min = a1[i];
            }
        }
        System.out.println("Minimum element in array is: " + min);
    }
}
