package multiThreading.interThreadCommunication06;

public class ProConBusyWaitSol02 {
    public static void main(String[] args) {

        box2 b=new box2();
        Thread t1=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                }
                catch(Exception e){}
                while(b.flag==true) {}
                b.producer(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0; i<10; i++) {
                try{
                    Thread.sleep(200);
                }
                catch(Exception e){}
                while(b.flag==false) {}
                b.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}
class box2{
   volatile Integer value;
   volatile boolean flag=false;

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

