package multiThreading.javaLocks07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class TryOptimisticRead03 {
    public static void main(String[] args) {

        ShearedResource2 sr=new ShearedResource2();

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
class ShearedResource2{
    private int value;

    StampedLock lock=new StampedLock();

    public int read(){
        long stamp = lock.tryOptimisticRead();
        int curr=value;

        try{
            Thread.sleep(1000);
        }catch (Exception e){};

        if(!lock.validate(stamp)){
            stamp=lock.readLock();
            try{
                curr=value;
            }
            finally {
                lock.unlockRead(stamp);
            }
        }
        System.out.println("Read "+ Thread.currentThread().getName() +"  :" +curr);
        return curr;
    }

    public void write(int NewVal){
       long stamp= lock.writeLock();
        try{
            try{
                Thread.sleep(1000);
            }catch (Exception e){};
            value=NewVal;
            System.out.println("Wrote "+ Thread.currentThread().getName() +"  :" +NewVal);
        }
        finally {
            lock.unlockWrite(stamp);
        }
    }
}