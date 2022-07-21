abstract class Writer{
    abstract void write();

}
class Pen extends Writer{
     void write(){
        System.out.println("I want to write by pen ");
    }
}
class Pencil extends Writer{
    void write(){
        System.out.println("I want to write by pencil");
    }
}
public class AbstractDemo {
    public static void main(String [] args)
    {
        Pen obj =new Pen();
        obj.write();
        Pencil obj1 = new Pencil();
        obj1.write();
    }
}
