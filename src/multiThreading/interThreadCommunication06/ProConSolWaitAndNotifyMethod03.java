package multiThreading.interThreadCommunication06;

public class ProConSolWaitAndNotifyMethod03 {
    public static void main(String[] args) {

        box3 b=new box3();
        Thread t1=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                    b.producer(i);
                }
                catch(Exception e){}
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                    b.consumer();
                }
                catch(Exception e){}
            }
        });

        t1.start();
        t2.start();
    }
}
class box3{
    volatile Integer value;
    volatile boolean flag=false;

  synchronized void producer(int val) throws InterruptedException{
      while(flag==true){
          wait();
      }
        value=val;
        flag=true;
        System.out.println("producer produce "+value);
        notify();
  }
   synchronized void consumer() throws InterruptedException{
      while(flag==false){
          wait();
      }
        System.out.println("consumer consume "+value);
        value=null;
        flag=false;
        notify();
  }
}