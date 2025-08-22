public class Interface {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.acc();
        c1.brake();
        c1.start();
    }
}

//interfaces are fully abstract classes
//we need to override it in child class i.e Car class here

interface engines{
    static final int price = 8098765;
    void start();
    void acc();
    void stop();

}
interface Brake {
    void brake();
}

//we use implement keyword to inherit interface
class Car implements Brake , engines {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void acc() {
        System.out.println("acc");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }
}
