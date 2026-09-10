package multiThreading.javaLocks07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWriterPloblem02 {

    public static void main(String[] args) {

        ShearedResource sr=new ShearedResource();

        Thread r1=new Thread(()->{ sr.read(); });
        Thread r2=new Thread(()->{ sr.read(); });
        Thread r3=new Thread(()->{ sr.read(); });
        Thread r4=new Thread(()->{ sr.read(); });

        Thread w1=new Thread(()->{ sr.write(100); });
        Thread w2=new Thread(()->{ sr.write(200); });
        Thread w3=new Thread(()->{ sr.write(300); });
        Thread w4=new Thread(()->{ sr.write(400); });

        r1.start();r2.start();r3.start();r4.start();
        w1.start();w2.start();w3.start();w4.start();

    }
}
class ShearedResource{
    private int value;

    ReadWriteLock rwlock=new ReentrantReadWriteLock(true);
    Lock rl=rwlock.readLock();
    Lock wl=rwlock.writeLock();

    public int read(){
        rl.lock();
        try{
            try{
                Thread.sleep(1000);
            }catch (Exception e){};
            System.out.println("Read "+ Thread.currentThread().getName() +"  :" +value);
            return value;
        }
        finally {
            rl.unlock();
        }
    }

    public void write(int NewVal){
        wl.lock();
        try{
            try{
                Thread.sleep(1000);
            }catch (Exception e){};
            value=NewVal;
            System.out.println("Wrote "+ Thread.currentThread().getName() +"  :" +NewVal);
        }
        finally {
            wl.unlock();
        }
    }
}