package javaInterviewQuestions;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;

        // Factorial in ascending order
        /*for(int i=1; i<=num; i++){
            factorial=factorial * i;
        }
        System.out.println("Factorial of a Number is "+ factorial);*/

        // Factorial in descending order
        for (int i=num; i>=1; i--){
            factorial=factorial * i;
        }
        System.out.println("Factorial of a Number is "+ factorial);

    }
}
