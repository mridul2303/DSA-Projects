public class StataicBlock {
    public static void main(String[] args) {
Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);
        Staticblock.b += 3;
        System.out.println(Staticblock.a+" " +Staticblock.b);

        Staticblock obj2 = new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);
    }
}
class Staticblock{
    static int a = 4;
    static int b ;
    //will only run once when first object is created i.e when the class is loaded at the first time
     static {
         System.out.println("hi there ");
         b = a*5;
     }}