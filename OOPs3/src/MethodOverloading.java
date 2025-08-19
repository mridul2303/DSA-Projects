public class MethodOverloading {
    public static void main(String[] args) {
        Maths m = new Maths();
        m.sum(2,3);
    }
}
class Maths {
    int sum(int a,int b ){
        return a+b;
    }
    int sum (int a , int b ,int c){
        return a+b+c;
    }
}
//at compile time it knows that which method is going to run that's why it is called compile time polymorphism
//name of method is same but arguments, returntype, ordering can be different