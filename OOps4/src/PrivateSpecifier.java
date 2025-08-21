public class PrivateSpecifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        //we cant do like
        //s1.rollno , but we can do like
        s1.getrollno();
    }

}
class Student {
    private int rollno;
    //we can use this rollno anywhere inside this class but can't use outside the class
    //we use getters and setters for private data

    String name;
    //this is default we can use it inside the package anywhere but can't use outside the package
//we can use it in same class , same package and sub class
    public int getrollno(){
return rollno;
    }
    public void setRollno(int rollno){
this.rollno = rollno;
    }
}
