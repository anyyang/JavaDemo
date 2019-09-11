package cn.liuyangjob.Reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by  liuyang
 * 2019/9/11    14:19
 * cn.liuyangjob.Reference
 * All Right Reserved by liuyang.
 **/

/**
 * 强引用：就像是老板（OOM）的亲儿子一样，在公司可以什么事都不干，
 *        但是千万不要老是占用公司的资源为他自己做事，记得用完公司的妹子之后,
 *        要让她们去工作(资源要懂得释放) 不然公司很可能会垮掉的。
 * 软引用：有点像老板(OOM)的亲戚，在公司表现不好有可能会被开除，
 *        即使你投诉他（调用GC)上班看片，但是只要不被老板看到（被JVM检测到）
 *        就不会被开除（被虚拟机回收）。
 * 弱引用：就是一个普通的员工，平常如果表现不佳会被开除（对象没有其他引用的情况下），
 *        遇到别人投诉（调用GC)上班看片,那开除是肯定了(被虚拟机回收)。
 * 虚引用：这货估计就是个实习生跟临时工把，遇到事情的时候想到了你，
 *        没有事情的时候，秒秒钟拿出去顶锅，开除。
 */
public class ReferenceTest {
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<VeryBig>();

    public static void checkQueue() {
        Reference<? extends VeryBig> ref = null;
        while ((ref = rq.poll()) != null) {
            if (ref != null) {
                System.out.println("In queue: " + ((VeryBigWeakReference) (ref)).id);
            }
        }
    }

    public static void main(String args[]) {
        int size = 3;
        LinkedList<WeakReference<VeryBig>> weakList = new LinkedList<WeakReference<VeryBig>>();
        for (int i = 0; i < size; i++) {
            weakList.add(new VeryBigWeakReference(new VeryBig("Weak " + i), rq));
            System.out.println("Just created weak: " + weakList.getLast());

        }

        System.gc();
        try { // 下面休息几分钟，让上面的垃圾回收线程运行完成
            Thread.currentThread().sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkQueue();
    }
}

class VeryBig {
    public String id;
    // 占用空间,让线程进行回收
    byte[] b = new byte[1024 * 1024];

    public VeryBig(String id) {
        this.id = id;
    }

    protected void finalize() {
        System.out.println("Finalizing VeryBig " + id);
    }
}

class VeryBigWeakReference extends WeakReference<VeryBig> {
    public String id;

    public VeryBigWeakReference(VeryBig big, ReferenceQueue<VeryBig> rq) {
        super(big, rq);
        this.id = big.id;
    }

    protected void finalize() {
        System.out.println("Finalizing VeryBigWeakReference " + id);
    }


    public void main(String args[]) throws InterruptedException {
        /**
         * 强引用（Strong Reference）：通常我们通过new来创建一个新对象时返回的引用就是一个强引用，
         * 若一个对象通过一系列强引用可到达，
         * 它就是强可达的(strongly reachable)，
         * 那么它就不被回收
         */
        String str = new String("abc");
        /** 软引用和弱引用的区别在于，若一个对象是弱引用可达，
         * 无论当前内存是否充足它都会被回收，
         * 而软引用可达的对象在<b>内存不充足时才会被回收<b/>，
         * 因此软引用要比弱引用“强”一些
         **/
        SoftReference<String> softRef = new SoftReference<String>(str);
        /*
         * 虚引用是Java中最弱的引用，那么它弱到什么程度呢？
         * <b>它是如此脆弱以至于我们通过虚引用甚至无法获取到被引用的对象，</b>
         * 虚引用存在的唯一作用就是当它指向的对象被回收后，虚引用本身会被加入到引用队列中，
         * 用作记录它指向的对象已被销毁。
         */
        String weak = "aaaa";
        WeakReference<String> weakReference = new WeakReference<>(weak);
        HashMap<String, Integer> map = new HashMap<>();
        map.put(weak, new Integer(1));
        int count = 100;
        while (count > 0) {
            count--;
            System.out.println(count + "weak" + weakReference.hashCode());
            Thread.sleep(1000);
        }
    }
}
