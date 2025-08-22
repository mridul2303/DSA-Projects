//creating a interface
interface A{
void a();
}
//we are extending an interface to another interface
interface B extends A{
    void b();
        }

//now we need to override both interface's methods
public class ExtendingInterfaces implements A , B {
    public void a(){
        System.out.println("a");
    }
    public void b(){
        System.out.println("b");
    }

}