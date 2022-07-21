public class Patterns {
    public static void main(String [] args)
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int alphabet=65;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char) (alphabet+j)+" ");
            }
            System.out.println();
        }

        int side=5;
        for(int i=1;i<=side;i++)
        {
            for(int j=1;j<=side;j++)
            {
                if(i==1 || i==side || j==1 || j==side)
                System.out.print("$");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
