public class InnerClass {

    //this static do not depends on innerclass object because it is static class
    //but its own object can be formed
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;

        }
    }

    public static void main(String[] args) {
        Test a = new Test("mridul");
        Test b = new Test("Kid");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}