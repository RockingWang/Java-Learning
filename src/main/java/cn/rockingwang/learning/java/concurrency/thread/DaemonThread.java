package cn.rockingwang.learning.java.concurrency.thread;

/**
 * 守护进程
 * 如果所有非守护进程结束是，守护进程被终止
 */
public class DaemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
        thread.start();
    }

}
