package cn.rockingwang.learning.java.concurrency.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * wait() 必须在 synchronize 代码块中使用（执行释放锁并挂起线程）
 * notify() 后挂起线程会在 wait() 处继续执行后续流程
 */
public class WaitNotifyExample {

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            System.out.println("wait before");
            wait();
            System.out.println("wait after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
        executorService.shutdown();
    }

}
