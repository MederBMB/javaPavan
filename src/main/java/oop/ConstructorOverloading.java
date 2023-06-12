package oop;

public class ConstructorOverloading {
    //Constructor Overloading ----> a class contains more than one constructor
    //1) Constructor is special kind of method
    //2) Constructor name should be same as class name
    //3) Constructor will not return any value
    //4) Constructor will be invoked at the time object creation (будет вызываться во время создания объекта)
    //   we no need call the constructor explicitly (нам не нужно явно вызывать конструктор)
    //5) Constructor will take the parameters (just like a method)
    //6) Constructor used for initialize the values

    //Two types of constructor
    //1)default constructor
    //2)parametrized constructor

    int a=0;
    int b=0;
    double c=0;

    ConstructorOverloading(){ //first
        a=10;
        b=20;
        c=20.5;
    }

    ConstructorOverloading(int x, int y){ //second
        a=x;
        b=y;
    }

    ConstructorOverloading(int x, double y){  //third
        a=x;
        c=y;
    }

    ConstructorOverloading(int x, int y, double z){ //fourth
        a=x;
        b=y;
        c=z;
    }

    ConstructorOverloading(int x, double y, int z){ //fifth
        a=x;
        b=z;
        c=y;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args) {

        ConstructorOverloading co = new ConstructorOverloading(); //call first constructor 10, 20, 20.5
        // ConstructorOverloading co = new ConstructorOverloading(10,20); //second constructor 10,20,0.0
        //ConstructorOverloading co = new ConstructorOverloading(10,20.5); //third const 10, 0, 20.5
        //ConstructorOverloading co = new ConstructorOverloading(10,20,20.5); // fourth 10,20,20.5
        //ConstructorOverloading co = new ConstructorOverloading(10,20.5,30); // fifth 10,30,20.5
        co.display();

    }
}
