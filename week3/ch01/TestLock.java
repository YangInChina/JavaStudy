package com.boyang_advantaged;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Boyang
 * @ClassName: com.boyang_advantaged
 * @Description: 测试Lock锁
 * @Date: Created in 16:27 2022/1/28
 */

public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();

    }
}

class TestLock2 implements Runnable{

    int ticketNum = 10;

    // 定义Lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                // 加锁
                lock.lock();
                if (ticketNum > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+": "+ticketNum--);
                }else {
                    break;
                }
            } finally {
                // 解锁
                lock.unlock();
            }



        }
    }
}
