class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName()  + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
           }
           }
           }

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        
        MyThread t2 = new MyThread();
        t2.start();
    }
}

