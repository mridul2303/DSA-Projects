public class AbstractClass {
    public static void main(String[] args) {
        //we can't create the object of abstract class
Son s = new Son(20);
        System.out.println(s.age);
        s.career();
    }
}
abstract class Parent{
    int age;
    int value;
    abstract void career();
    //abstract methods do not have body
    Parent(int age){
        this.age = age;
        value = 127319;
    }
}

class Son extends Parent{
     Son(int age){
        super(age);
    }
    //we define body of abstract class in the child class
void career(){
    System.out.println("i want to be an IAS officer");}
}
//can't create abstract constructor
//can't create abstract static method
//because abstract method needs to override in child class