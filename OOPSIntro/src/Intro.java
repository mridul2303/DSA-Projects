public class Intro {
    public static void main(String[] args) {
        Student s1; // this is just declaration
       // s1.roll = 12; this will give error
        //we need to initialze it
        s1 = new Student(); // s1 is object of student class
        s1.roll = 12;
        System.out.println(s1.roll);
        System.out.println(s1.name); //default value of datatype will be print

        Car c1 = new Car(); // this allocates memory during runtime i.e. dynamic memory allocation
        System.out.println(c1.engine);
        System.out.println(c1.price);
        Car c2 = new Car();
        System.out.println(c2.seats);
        System.out.println(c1.seats);

    }
}
class Student{
    int roll;
    String name;
    Float marks;
}
//class is basically blueprint of object which have properties and behaviour of object
class Car{
    String engine;
    int price;
    int seats;
    Car(){ //this is a constructor
        this.engine="petrol";
        this.price=1245; // this represents objects of Car 
        this.seats=4;
    }
}