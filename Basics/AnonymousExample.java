
class A
{
    public void show()
    {
        System.out.println("In a  show");
    }
}
public class AnonymousExample {
    public static void main(String[] args)
    {
        A obj =new A()
        {
            public void show()
            {
                System.out.println("I am the best");
            }
        };
        obj.show();
    }
}

