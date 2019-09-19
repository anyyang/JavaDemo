package cn.liuyangjob.Lock;

/**
 * Created by  liuyang
 * 2019/9/19    10:42
 * cn.liuyangjob.Lock
 * All Right Reserved by liuyang.
 **/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 * Semaphore 是 synchronized 的加强版，作用是控制线程的并发数量
 *  private Semaphore semaphore = new Semaphore(2);
 *  同步关键类，构造方法传入的数字是多少，则同一个时刻，
 *  只运行多少个进程同时运行制定代码
 */
public class SemaphoreTest {


    public static void main(String args[]) {
        SemaphoreService service = new SemaphoreService();
        for (int i = 0; i < 20; i++) {
            MyThread t = new MyThread("thread" + (i + 1), service);
            t.start();// 这里使用 t.run() 也可以运行，但是不是并发执行了
        }
    }
}
class MyThread extends Thread {
    private SemaphoreService service;

    public MyThread(String name, SemaphoreService service) {
        super();
        this.setName(name);
        this.service = service;
    }

    @Override
    public void run() {
        this.service.doSomething();
    }
}


class SemaphoreService {
    // 同步关键类，构造方法传入的数字是多少，则同一个时刻，
    // 只运行多少个进程同时运行制定代码
    // 可以理解为通道数
    private Semaphore semaphore = new Semaphore(6);
    public void doSomething() {
        try {
            /**
             * 在 semaphore.acquire() 和 semaphore.release()之间的代码，
             * 同一时刻只允许制定个数的线程进入，因为semaphore的构造方法是1，
             * 则同一时刻只允许一个线程进入，其他线程只能等待。
             *
             * */
            semaphore.acquire(1);
            System.out.println(Thread.currentThread().getName() + ":doSomething start-" + System.currentTimeMillis()+"  通道数目availablePermits："+availablePermits());
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + ":doSomething end-" + System.currentTimeMillis());

            semaphore.release(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public int availablePermits() {    // 查看可用通路数
        return semaphore.availablePermits();
    }
}
