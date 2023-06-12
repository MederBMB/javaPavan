package javaInterviewQuestions;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Java     Programming     Selenium              Automation";
        System.out.println("Before removing white spaces: " + str);
        str = str.replaceAll("\\s", "");
        System.out.println("After removing white spaces: " + str);

    }
}
