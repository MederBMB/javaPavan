package oop;

public class MethodOverloading {
    //Method Overloading ----> a class contains more than one method with the same names
    //1)number of parameters
    //2)order of parameters
    //3)data type of parameters

    int a;
    int b;

    void sum(){ //First
        a=10;
        b=20;
        System.out.println(a+b);
    }
    void sum (int x, int y){ //Second
        int a=x;
        int b=y;
        System.out.println(a+b);
    }

    void sum(int x, int y, int z){ //Third
        System.out.println(x+y+z);
    }

    void sum(int x, double y){  //Fourth
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.sum();  //call the first method 30
        mo.sum(100,200); //call the second method
        mo.sum(10,20,30); //call the third method
        mo.sum(10,10.5); //call the fourth method

    }

}
