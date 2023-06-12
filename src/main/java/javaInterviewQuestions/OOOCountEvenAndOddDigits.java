package javaInterviewQuestions;

public class OOOCountEvenAndOddDigits {

    public static void main(String[] args) {

        int num = 555;
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0){
            int reminder = num % 10;
            if (reminder%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Digits of Even Numbers:" + evenCount);
        System.out.println("Digits of Odd Numbers:" + oddCount);
    }
}
