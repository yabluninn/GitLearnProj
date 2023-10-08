package multithreading;

public class ThreadExampleFive extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread threadOne = new Thread(new MyRunnableOne());
        ThreadExampleFive threadTwo = new ThreadExampleFive();

        System.out.println(threadOne.getState()); // NEW

        threadOne.start();
        threadTwo.start();

        System.out.println(threadOne.getState()); // RUNNABLE

        System.out.println("Start!");

        threadOne.join();
        threadTwo.join();

        System.out.println(threadOne.getState()); // TERMINATED

        System.out.println("End!");
    }
}

class MyRunnableOne implements Runnable{
    public void run(){
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
