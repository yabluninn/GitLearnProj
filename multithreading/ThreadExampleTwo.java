package multithreading;

public class ThreadExampleTwo {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }
}

class ThreadOne implements Runnable{
    public void run(){
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class ThreadTwo implements Runnable{
    public void run(){
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}