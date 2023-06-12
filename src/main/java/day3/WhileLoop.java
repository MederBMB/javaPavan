package day3;

public class WhileLoop {
    public static void main(String[] args) {

        int i=1;             //initialization

        // 1 to 10 numbers
        /*while (i<=10){       //condition
            System.out.println(i);  //1, 2, 3, ..... 9, 10
            i++;             // incrementation
        }*/

        //even numbers between 1 to 10
        /*i=2;
        while (i<=10){
            System.out.println(i);  //2, 4, 6, 8, 10
            i+=2;             //i=i+2;
        }*/

        //descending numbers from 10 to 1
        i=10;
        while (i>=1){
            System.out.println(i); // 10, 9, 8, ....., 2, 1
            i--;
        }
    }
}
