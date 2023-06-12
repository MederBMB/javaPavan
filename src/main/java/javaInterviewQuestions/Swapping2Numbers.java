package javaInterviewQuestions;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before swapping the values are: "+a+" "+b);

        //Logic1 -----> Third variable
        /*int t=a;
        a=b;
        b=t;*/

        //Logic2 -----> use + & - without using third variable
        /*a=a+b;  //10+20=30
        b=a-b;  //30-20=10
        a=a-b;  //30-10=20*/

        //Logic3 -----> use * & / without using third variable
        //here a & b values should not be Zero
        /*a=a*b;  //10*20=200
        b=a/b;  //200/20=10
        a=a/b;  //200/10=20*/

        //Logic4 -----> bitwise XOR (^)
        /*a=a^b;   //30
        b=a^b;   //
        a=a^b;   //*/

        //Logic5 -----> Single statement
        // a=10   b=20
        b = a + b - ( a = b ); // -----> выполняется справа налево
        // 10 = 10+20 - (20 = 20)
        System.out.println("After swapping the values are: "+a+" "+b);
    }
}
