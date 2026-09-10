package multiThreading.threadCreationLifecycle;

public class usingRunnableInterface {
    public static void main(String[] args) {
        MyThread2 myThread=new MyThread2();

        Thread t2=new Thread(myThread);
        t2.start();

        Thread t3= new Thread(()-> System.out.println("hello, i am lambda with thread t3"));
        t3.start();
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello I'm from MyThread2");
    }
}
