package cn.rockingwang.concurrency.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;

        CountDownLatch countDownLatch = new CountDownLatch(totalThread);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.println("run ...");
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
    }

}
