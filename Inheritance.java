//package javainheritance.javapackage;

class Parent{
    int num1 = 10;
    int num2 = 20;

    public Parent(){
        System.out.println("Hi! This is Parent class constructor.");
    }
    public void methd(){
        System.out.println(num1 + num2);
    }
}
class Child extends Parent{
    public Child(){
        //System.out.println("Hello! This is child class cinstructor.");;
        super();
    }
    
    public void display(){
        int result = super.num1 * super.num2;
        System.out.println(result);

    }
}
public class Inheritance{
    public static void main(String[] args) {
        Child obj = new Child();
        
        obj.methd();
        obj.display();
    }

}



