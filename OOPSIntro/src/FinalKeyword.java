public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 10;
        //now this a is constant now we can't change the value of a
        //but this if for primitive datatype
       final Teacher t1 = new Teacher(50000);
        System.out.println(t1.salary);
       //now here we can change value of salary but cant reassign it
        t1.salary = 345;
        System.out.println(t1.salary);
//hence salary is changed
    }
}
class Teacher{
    String depart;
    int salary;
    Teacher(int salary){
        this.salary = salary;


    }}