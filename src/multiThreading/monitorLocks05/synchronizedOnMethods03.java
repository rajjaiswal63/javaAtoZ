package multiThreading.monitorLocks05;

public class synchronizedOnMethods03 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        Thread t1=new Thread(()->t.m1());
        Thread t2=new Thread(()->t.m2());
    }
}
class Test1 {
    static void m1() {
        synchronized(Test.class) {
            System.out.println("m1 entered");

            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {};

            System.out.println("m1 exit");
        }
    }

    void m2() {
        synchronized(this) {
            System.out.println("m2 entered");

            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {};

            System.out.println("m2 exit");
        }
    }
}