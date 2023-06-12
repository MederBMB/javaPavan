package javaInterviewQuestions;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();    //Welcome to Java
        int count = 1;
        for (int i = 0; i<s.length()-1; i++){
            if((s.charAt(i) == ' ' && (s.charAt(i+1) != ' '))){
                count++;
            }
        }
        System.out.println("Number of words in a string: " + count);

    }
}
