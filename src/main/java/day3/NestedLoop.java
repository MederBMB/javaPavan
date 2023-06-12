package day3;

import java.sql.SQLOutput;

public class NestedLoop {
    public static void main(String[] args) {

        int i;
        for (i=1; i<=5; i++){
            System.out.print("*");      //*****
        }
        System.out.println("----------------------------------------------------------------");

        int j;
        for (j=1; j<=6; j++) {
            for (i = 1; i <= 5; i++) {
        System.out.print("*");
    }
            System.out.println("\n");
}


    }
}
