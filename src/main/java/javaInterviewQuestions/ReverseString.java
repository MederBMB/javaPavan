package javaInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        //1)Using concatenation operator
        /*String str = "Hello world";
        String reversed = "";
        int len = str.length();
        for (int i = len-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);*/


        //2)Using .toCharArray
//        String str = "Hello world";
//        String reversed = "";
//        char a[]=str.toCharArray();
//        int len = a.length;
//
//        for (int i=len-1; i>=0; i--){
//            reversed = reversed+a[i];
//        }
//        System.out.println(reversed);

        //3)Using StringBuffer
        String str = "Hello world";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
