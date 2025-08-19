import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
Base b =new Base();
b.print();
        Derived d = new Derived();
        d.print();
    }
}
class Base{
    public void print(){
        System.out.println("base class");
    }}
     class Derived extends Base{
        public void print(){
            System.out.println("derived class ");

        }
    }