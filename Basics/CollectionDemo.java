import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo
{
    public static void main(String[] args)
    {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        Iterator it = values.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        List value = new ArrayList();
        value.add(10); // Integer v = new Integer(4)
        value.add(11);
        value.add("yes");
        value.add("Hii");

        for(Object o : value)
        {
            System.out.println(o);
        }

        List<Integer> integer_value = new ArrayList<>();  // 1.5
        integer_value.add(25);
        integer_value.add(35);
        integer_value.add(45);
        integer_value.add(55);


        for(Integer o : integer_value)
        {
            System.out.println(o);

        }
    }
}