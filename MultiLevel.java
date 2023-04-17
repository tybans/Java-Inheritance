//package javainheritance.javapackage;


public class MultiLevel {
    class X {
        public void methodX() {
            System.out.println("Class X method");
        }
    }

    class Y extends X {
        public void methodY() {
            System.out.println("class Y method");
        }
    }

    class Z extends X{
        public void methodZ() {
            System.out.println("class Z method");
        }
    }

    public static void main(String args[]) {
        MultiLevel obj= new MultiLevel();
        MultiLevel.Z obj2 = obj.new Z();
        MultiLevel.X obj3 = obj.new X();
        MultiLevel.Y obj4 = obj.new Y();
        obj2.methodX();
        //obj2.methodY();
        obj2.methodZ();
        obj3.methodX();
        obj4.methodX();
        obj4.methodY();

        
    }
}

//OuterClass outerObject = new OuterClass();
// OuterClass.InnerClass innerObject = outerObject.new InnerClass()

