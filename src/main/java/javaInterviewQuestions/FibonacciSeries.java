package javaInterviewQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1 + " " + n2);  // 0  1

        for (int i=2; i<10; i++){
            sum = n1 + n2;   // 2 + 3
            System.out.print(" " + sum);   // 1  2  3  5  8  13  21  34
            n1 = n2;  //2
            n2 = sum; //3
        }
    }
}
