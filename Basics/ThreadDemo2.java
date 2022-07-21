
public class ThreadDemo2 {
    public static void main(String[] args) throws Exception{
        Runnable obj1= () ->
        {
            for(int i=1;i<=5;i++){
                System.out.println("hi");
                try{Thread.sleep(500);} catch(Exception e){}
            }
        }
        ;
        Runnable obj2 = () ->
        {
                for(int i=1;i<=5;i++){
                    System.out.println("hello");
                    try{Thread.sleep(500);} catch(Exception e){}

            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{ Thread.sleep(10);} catch(Exception e){}
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Bye");

    }
}

