//package javainheritance.javapackage;

class Parent1{
    int num1;
    int num2;
    public Parent1(int no1,int no2){
        this.num1=no1;
        this.num2=no2;
    }
    // int num1=10;
    // int num2=100;
    public void add(){
        System.out.println(this.num1+this.num2);
    }

}

class child1 extends Parent1{

    public child1(){
        super(5,7);
    }
    public void multiply(){
        System.out.println(num1*num2);
    }
}

class Inheritance3{
    public static void main(String[] args) {
        child1 childObj= new child1();
        childObj.add();
        childObj.multiply();
    }
}