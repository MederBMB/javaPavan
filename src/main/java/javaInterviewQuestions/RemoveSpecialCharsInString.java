package javaInterviewQuestions;

public class RemoveSpecialCharsInString {
    public static void main(String[] args) {
        String s = "Selenium$#@Testing#%^&!@Java";
        System.out.println("String before remove junks: " + s);
        s=s.replaceAll("[^a-zA-Z0-9]",""); //ukazyvaem simvoly, kotorye nado ostavit'
        System.out.println("String after remove junks: " + s);

    }
}
