package javaInterviewQuestions;

public class SearchElementInArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 40, 50, 30};
        int searchElement=200;
        boolean flag=false;

        for (int i=0; i<a.length; i++){
            if (searchElement==a[i]){
                System.out.println("Element found at index: "+i);   //pod kakim indeksom nayden element
                flag=true;
                break;
            }
        }
        if (flag==false) {
            System.out.println("Element not found");
        }
    }
}
