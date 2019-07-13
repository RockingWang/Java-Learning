package cn.rockingwang.learning.java.concurrency.thread;

/**
 * 继承 thread 方式新建线程
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        // ...
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

}
