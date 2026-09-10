package multiThreading.threadCreationLifecycle;

public class threadLifeCycle06 {
    public static void main(String[] args) {

        Thread mainThread=Thread.currentThread();

    //Thread new Stage
        Thread t1=new Thread(()->{
            System.out.println("t1 is alive");
            System.out.println("Stage og main Thread "+mainThread.getState());
        });
        System.out.println("t1 stage--new "+t1.getState());

        //runnable stage
        t1.start();
        System.out.println("t1 stage-runnable "+t1.getState());

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("t1 stage--terminated "+t1.getState());
    }
}
