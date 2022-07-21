public class ExceptionDemo {
    public static void main (String [] args){
        try
        {
            int arr[] = new int[6];
            arr[6]=9;
            int i=9,j=0;
            int k=i/j;
            System.out.println("Output is  "+k);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit...");
        }
        catch(Exception e)
        {
            System.out.println("Something wrong ");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
