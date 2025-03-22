public class MyThread extends Thread {
    int iNumber = 12345;

    public void methodOne() {
        Thread t = new Thread(() -> {
            System.out.println( iNumber);
        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.methodOne();
    }

    /// Bai 1 ghi cẩn thận có dư 1 chút
}
