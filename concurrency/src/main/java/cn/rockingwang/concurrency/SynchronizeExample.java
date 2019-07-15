package cn.rockingwang.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Synchronize
 */
public class SynchronizeExample {

    /**
     * 同步对象
     */
    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * 同步一个方法
     */
    public synchronized void func2() {
        // 等同于同步一个对象
    }

    /**
     * 同步类
     */
    public void func3() {
        synchronized (SynchronizeExample.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * 同步一个静态方法
     */
    public synchronized static void func4() {
        // 等同于同步类
    }

    /**
     * 同步同一个对象
     */
    public static void main1(String[] args) {
        SynchronizeExample e1 = new SynchronizeExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
        executorService.shutdown();
    }

    /**
     * 同步不同对象
     */
    public static void main2(String[] args) {
        SynchronizeExample e1 = new SynchronizeExample();
        SynchronizeExample e2 = new SynchronizeExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
        executorService.shutdown();
    }

    public static void main3(String[] args) {
        SynchronizeExample e1 = new SynchronizeExample();
        SynchronizeExample e2 = new SynchronizeExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func2());
        executorService.execute(() -> e2.func2());
        executorService.shutdown();
    }

}
