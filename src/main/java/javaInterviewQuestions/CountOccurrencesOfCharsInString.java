package javaInterviewQuestions;

public class CountOccurrencesOfCharsInString {
    public static void main(String[] args) {

        String s = "Java Programming Java oops";
        int totalCount = s.length();     //total length
        int totalCountAfterRemove = s.replace("a","").length(); //total len after removing a's
        int count = totalCount-totalCountAfterRemove;
        System.out.println("Number occurrences of a is: " + count);

    }
}
