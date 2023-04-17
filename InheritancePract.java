//package javainheritance.javapackage;

class First {
    int num1 = 10;
    int num2 = 20;
    public void meth(){
        System.out.println(num1 + num2);

    }
}
class Sec extends First {
    public void display(){
        //int result = num1 * num2;
        System.out.println(num1 * num2);

    }
}
public class InheritancePract {
    public static void main(String[] args) {
        
        Sec obj = new Sec();
        //First obj1 = new First();
        //obj1.display();
        //System.out.println(obj.num1);
        obj.meth();
        obj.display();
    }
}
