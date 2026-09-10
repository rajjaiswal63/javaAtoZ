package multiThreading.monitorLocks05;
public class synchronized01 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 c1 = new Counter1();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=5000; i++) {
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);
    }
}

class Counter1 {
    public int count = 0;

    synchronized void increment() {
        // normal code
        count++;

//        synchronized(this) {
//            count++; // 3 operation
//        }



    }
}
// Critical Section