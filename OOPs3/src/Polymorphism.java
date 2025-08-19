public class Polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle c = new Circle();
        Square s = new Square();
        s.area();
    }
}
 class Shapes{
    void area(){
        System.out.println("i am in shapes");

    }}
class Circle extends Shapes{
    void area(){
        System.out.println("pi*r*r");

    }}
class Square extends Shapes{
    void area(){
        System.out.println("side*side");
    }
}
//using the same function but with different definition with different use
