public class Pattern1 {
    public static void main(String[] args) {
        print(4,1);
    }
    public static void print(int r,int c){
        if (r==-1 && c==1 ){
            return;
        }
        if (r<c){
            System.out.println("*");
            print(r-1,1);
        }
        if (r>=c){
            System.out.print("*");
            print(r,c+1);
        }

    }
}
