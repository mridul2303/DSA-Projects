public class MoreAboutStatic {
    public static void main(String[] args) {


    }
    static void fun(){
        System.out.println("lets have fun");
        //greets();
        //we can't use non static inside static
        //it requires instance but function you are using does not require instance
        //you cannot use non static stuff without referencing their instance in a static context
        //hence i am referencing it
        main();
    }
    void greets(){
        System.out.println("hey");
        fun();
        //but we can use static inside nonstatic
    }
}
