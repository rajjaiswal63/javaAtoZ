package multiThreading.threadCreationLifecycle;

public class executionOder05 {
    public static void main(String[] args) {
        System.out.println("main");
        Thread t1= new Thread(()-> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) System.out.println("even : "+i);
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) System.out.println("odd : "+i);
            }
        });

        t1.start();
        t2.start();


    }
}
