package cn.rockingwang.learning.java.concurrency.thread;

/**
 * 实现 runnable 方式新建线程
 */
public class MyRunnable implements Runnable {

    public void run() {
        // ...
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
