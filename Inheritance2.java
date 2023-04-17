//package javainheritance.javapackage;


class Parent2{
    int num1 ;
    int num2 ;

    public Parent2(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;

    }
    public void methd(){
        System.out.println(num1 + num2);
    }
}
class Child2 extends Parent2{
    public Child2(){
        
        super(100, 20);
    }
    
    public void display(){
        
        System.out.println(num1 * num2);

    }
}
public class Inheritance2{
    public static void main(String[] args) {
        Child2 obj = new Child2();
        
        obj.methd();
        obj.display();
    }

}

