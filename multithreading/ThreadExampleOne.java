package multithreading;

public class ThreadExampleOne {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }
}

class ThreadOne extends Thread{
    public void run(){
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class ThreadTwo extends Thread{
    public void run(){
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
