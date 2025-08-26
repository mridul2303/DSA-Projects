public class ExceptionHandling {
    //basically runtime error are exceptions
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;

            int c = a / b; //here it will give arithmatic exception so we need to write this in try block
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("this will always execute");
        }
        catch (Exception e){
            System.out.println("this will always execute");
        }
        //we can't write exception above arithmatic exception because it will say excpetion already been caught
        //so more stirct exception have to be write above
    finally {
            //this will always run wheather exception comes or not
            System.out.println("finally");{
            }

        }
    }
}