package multiThreading.threadCreationLifecycle;

public class usingThreadClass {
    public static void main(String[] args){
        Thread t1=new MyThread();
        t1.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.print("hello, i am a Thread !");
    }
}
