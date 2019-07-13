package cn.rockingwang.learning.java.concurrency.thread;

/**
 * 1. Interrupt thread 测试
 * 2. Synchronize 不能被中断测试
 */
public class InterruptExample {

    private static class MyThread extends Thread {

        private static String lock = "123";

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "进入临界区");
                    Thread.sleep(20000);
                }
                System.out.println(Thread.currentThread().getName() + " done.");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        thread1.start();
        Thread.sleep(1000);
        thread2.start();


        thread2.interrupt();

        System.out.println("Main run.");

    }

}
