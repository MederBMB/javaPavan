package day1;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //Arithmetic operators
        System.out.println("Sum of a and b is:" + (a+b));        //Sum of a and b is:30
        System.out.println("Diff of a and b is:" + (b-a));       //Diff of a and b is:10
        System.out.println("Mul of a and b is:" + (a*b));        //Mul of a and b is:200
        System.out.println("Div of a and b is:" + (b/a));        //Div of a and b is:2
        System.out.println("Mod div of a and b is:" + (a%b));    //Mod div of a and b is:10

        //Relational (Comparison) operators -----> always return boolean values
        System.out.println(a==b);   //false
        System.out.println(a>b);    //false
        System.out.println(a<b);    //true
        System.out.println(a>=b);   //false
        System.out.println(a<=b);   //true
        System.out.println(a!=b);   //true

        //Logical operators --------->works between two boolean
        boolean x=true;
        boolean y=false;
        System.out.println(x&&y); //false
        System.out.println(x||y); //true
        System.out.println(!x);   //false
        System.out.println(!y);   //true

        //Increment/Decrement operators
        a++;  //a=a+1;
        System.out.println(a);  //11
        b--;  //b=b-1;
        System.out.println(b);  //19








    }
}
