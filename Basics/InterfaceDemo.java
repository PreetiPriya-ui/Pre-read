// Types of Interface
// 1. Normal
// 2. Single abstract method - functional interface - lambda expression
// 3. Marker interface - does not have any method

@FunctionalInterface
interface Abc
{
    void show();

}
@FunctionalInterface
interface Demo
{
    void ab();
    default void show()
    {
        System.out.println("In show");
    }

}
interface my_demo{
    static void find()
    {
        System.out.println("Hii");
    }
}


class DemoImp implements Demo
{
    public void ab()
    {
        System.out.println("In ab");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj= () -> System.out.println("I am the best");
        obj.show();
        Demo obj1= new DemoImp();
        obj1.ab();
        obj1.show();
        my_demo.find();
    }
}
