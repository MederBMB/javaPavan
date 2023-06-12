package javaInterviewQuestions;

import java.util.HashSet;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        String arr[] = {"Java", "C", "C++", "Python", "Java"};

        //1)using for loop & if
        /*boolean flag = false;            //Необязательно
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Found duplicate Element: " + arr[i]);
                    flag = true;        //Необязательно
                }
            }
        }
        if(flag==false){                //Необязательно
            System.out.println("Duplicate Element NOT found");    //Необязательно
        }*/

        //2) using HashSet

        HashSet<String> langs = new HashSet();
        /*System.out.println(langs.add("Java"));     //------>true
        System.out.println(langs.add("Python"));   //------>true
        System.out.println(langs.add("Java"));     //------>false, because it ia not unique*/

        boolean flag = false;
        for(String l:arr){
            if(langs.add(l) == false){
                System.out.println("Found Duplicate Element: " + l);
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Not found duplicates");
        }
    }
}
