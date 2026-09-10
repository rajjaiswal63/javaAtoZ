package multiThreading.threadMethods03;

public class sleepMethods01 {
    public static void main(String[] args) {

        //sleep()  -- Thread.sleep(long millis)

        System.out.println("main Thread is alive");

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main Thread is terminated");


    }
}
