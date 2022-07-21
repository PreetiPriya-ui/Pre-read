public class IterationDemo {
    public static void main(String [] args)
    {
        int i=1;
        System.out.println("While Loop -----");
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("Nested for loop ----");

        for(int j=1;j<=4;j++)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
