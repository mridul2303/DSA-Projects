public class Pattern2 {
    public static void main(String[] args) {
        print(1,1);

    }
    public static void print(int r,int c){
        if (r>4 ){
            return;
        }
        if (r<c){
            System.out.println();
            print(r+1,1);
        }
        if (r>=c){
            System.out.print("*");
            print(r,c+1);
        }
    }
}