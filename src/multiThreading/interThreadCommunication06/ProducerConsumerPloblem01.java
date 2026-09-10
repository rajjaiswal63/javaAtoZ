package multiThreading.interThreadCommunication06;

import static java.sql.Types.NULL;

public class ProducerConsumerPloblem01 {
    public static void main(String[] args) {

        box b=new box();
        Thread t1=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                }
                catch(Exception e){}
                 b.producer(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                }
                catch(Exception e){}
                b.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}
class box{
    Integer value;
    boolean flag;

    public void producer(int val){
        value=val;
        flag=true;
        System.out.println("producer produce "+value);
    }

    public void consumer(){
        System.out.println("consumer consume "+value);
        value=null;
        flag=false;
    }
}
