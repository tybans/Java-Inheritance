//package javainheritance.javapackage;

class parent5 {
    int a = 100;
    int b = 10;

    // public parent() {
    //     System.out.println("hiiiiii parent class constructor");
    // }

    public void display() {
        System.out.println("name: " + a + "id: " + b);
    }

}

class Child5 extends parent5 {
    int a = 20;

    // child() {
    //     super();
        //System.out.println("hello child class constructor");
    //}

    public void display() {
        System.out.println("no1 " + super.a + " no2 " +b);
    }
    public void newmethd(){
        super.display();
    }
}

public class OverrideInheritance {
    public static void main(String[] args) {

        Child5 obj2 = new Child5();
        obj2.display();
        //obj2.details();
        obj2.newmethd();
    }
}