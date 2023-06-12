package javaInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int num = sc.nextInt(); //1234

        //1) using algorithm
        /*int rev=0;

        while(num!=0){
            rev = rev * 10 + num % 10; //0+1234%10=4     40+3=43     430+2=432    4320+1+4321
            num=num/10;  //1234/10=123    123/10=12    12/10=1    1/10
        }
        System.out.println("Reverse Number is:" + rev);  //----->4321*/

        //2) using StringBuffer class
        /*StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev=sb.reverse();

        System.out.println("Reverse Number is:" + rev);*/

        //3) using StringBuilder class
        /*StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.out.println("Reverse Number is:" + rev);*/

        //4)
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int num1 = Integer.parseInt(sb.toString());
        System.out.println(num1);
    }
}
