public class Inheritance {
    public static void main(String[] args) {
        boxweight bw = new boxweight(200);
        Box b = new boxweight(234);
        //reference type is box but object type is boxweight
        //here we can print box properties but cant print boxweigth

        //you are given access the variables which are in ref type i.e boxweight
        //this also means that once you are trying to access should be initialized
        //but here obj itself is of parent class so how will you call the child class var like weight
        //this is why error
       // boxweight bw2 = new Box();

    }
}
class Box{
    double length;
    double width;
    double depth;

    Box(){
        this.length = -1;
        this.width = -1;
        this.depth = -1;
        //super
        //this basically refers to object class because every class or anything is a subclass of object class
    }
    Box(double l , double w , double d){
        this.length = l;
        this.width = w;
        this.depth = d;
    }
}

class boxweight extends Box{
    double weight ;
    boxweight(double w){
        //super basically means directly above class
        //parent class of boxweigth i.e box class
        super(22,32,21); //what is this??
        //call parent class constructor , use to initialize values present in parent class
        this.weight = w;
    }}
