package cn.liuyangjob.ExtsenloaderTest.carimpl;

import cn.liuyangjob.ExtsenloaderTest.api.Car;

/**
 * Created by  liuyang
 * 2019/12/30    15:09
 * cn.liuyangjob.ExtsenloaderTest.carimpl
 * All Right Reserved by liuyang.
 **/

public abstract class AbstarctCar implements Car {
    @Override
    public void didi() {
        System.out.println("didi!");
    }
}
