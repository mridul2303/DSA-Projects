public class MoreAboutStatic {
    public static void main(String[] args) {


    }
    static void fun(){
        System.out.println("lets have fun");
        greets();
        //we can't use non static inside static
    }
    void greets(){
        System.out.println("hey");
        fun();
        //but we can use static inside nonstatic
    }
}
