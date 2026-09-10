package multiThreading.monitorLocks05;

public class synchronizedAsClass02 {
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1=new Thread(()->t.m1());
        Thread t2=new Thread(()->t.m2());

        t1.start();
        t2.start();
    }
}

class Test {
    synchronized void m1() {
            System.out.println("m1 entered");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {};
            System.out.println("m1 exit");
    }

    synchronized void m2() {
            System.out.println("m2 entered");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {};
            System.out.println("m2 exit");

    }
}