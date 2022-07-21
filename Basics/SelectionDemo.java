import java.util.*;
public class SelectionDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("nothing");
        else if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        // Ternary operator
        String res = n>0 ? "positive": "negative";
        System.out.println(res);

    }

}
