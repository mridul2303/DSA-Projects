public class ProtectedAndPublic {

}
class Teacher {
    public String name;
    //public things can be use anywhere
    protected int salary;
    //protected stuff uses in same class , package , subclass everwhere except different package and not subclass



}
class School extends Teacher{
    School(int salary){
        this.salary = salary;
        this.name = "T1";
    }
}