//package javainheritance.javapackage;

class parent4 {
    int a;
    int b;
  

    public parent4(int a1, int b1) {
        this.a = a1;
        this.b = b1;
        System.out.println("hiiiiii parent class constructor");
    }

    public void display() {
        System.out.println("name: " + a + " id: " + b);
    }

}

class child4 extends parent4 {
    

    child4() {
        super(10, 100);
        System.out.println("hello child class constructor");
    }

    public void details() {
        System.out.println("naam: " + a + " id: " + b );
    }
}

public class Inheritance4 {
    public static void main(String[] args) {

        child4 obj2 = new child4();
        obj2.display();
        obj2.details();
    }
}