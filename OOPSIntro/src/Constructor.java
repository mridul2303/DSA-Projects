public class Constructor {
    public static void main(String[] args) {
        Bike b1 = new Bike(300000,30,"Royal Enfied");
        System.out.println(b1.mileage);
        System.out.println(b1.price);
        System.out.println(b1.name);

        Bike b2 = new Bike();
        b2.price = 1300020;
        b2.name = "ninja";
        System.out.println(b2.price);

        Bike b3 = new Bike(b2); //object b3 have parameter of object b2
        System.out.println(b3.name);

    }
}
class Bike{
    int price ;
    String name;
    int mileage;

    //Bike BMW = new Bike(23466,23,"BMWbike");
    //now here this will be replaced by BMW

    Bike(){
        //calling another constructor from this constructor
        //internally : new Bike();
        this(23,234,"lkjh");

    }
    Bike(int paisa,int mileage,String name){
        //there are two things either name other name like
        price = paisa;
        mileage = mileage;
        this.name = name;
        //here it will not print mileage value it will give default value of int
        //we need to either use this or use some other name
        //if you call with parameter then the 2 constructor will be called otherwise first constructor will be called
    }
    Bike(Bike other){
        //here we are taking another objects value
        this.name = other.name;
//this other represents to b3 with represents to b2
    }
}
