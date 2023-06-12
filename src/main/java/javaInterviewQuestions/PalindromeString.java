package javaInterviewQuestions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");

        String str = sc.next();
        String org_str = str;

        String reversed = "";
        int len = str.length();
        for (int i = len-1; i>=0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if(org_str.equals(reversed)){
            System.out.println(org_str+ " is Palindrome String");
        }else{
            System.out.println(org_str+ " is Not Palindrome String");
        }

    }
}
