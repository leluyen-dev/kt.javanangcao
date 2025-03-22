public class bai1 {
    static class MyThread implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
