public class StaticVAr {
    public static void main(String[] args) {
        Human h1 = new Human("lala" , 23);
        System.out.println(Human.population);
        System.out.println(h1.age);
        System.out.println(h1.name);
//population is constant for every human so it should have a single value for everyone
//static variables belong to the class they do not belong to the object

        greeting();
        // inside static method we can't use something non static
        //hence we need to make greetings static
}
 static void greeting (){
    System.out.println("hello world!");

}}
class Human{
    //static variables are not dependent on objects
    static int population;
    String name;
    int age;

    Human(String name , int age){
        this.name = name;
        this.age = age;
        this.population = 124;

    }}
// non static things belongs to object