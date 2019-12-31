package cn.liuyangjob.ExtsenloaderTest.carwrapper;

import cn.liuyangjob.ExtsenloaderTest.api.Car;
import cn.liuyangjob.ExtsenloaderTest.carimpl.AbstarctCar;
import com.alibaba.dubbo.common.URL;

/**
 * Created by  liuyang
 * 2019/12/30    15:13
 * cn.liuyangjob.ExtsenloaderTest.carwrapper
 * All Right Reserved by liuyang.
 **/

public class CarWrapper2 extends AbstarctCar implements Car {
    /*public void setImpl(Car impl) {
        this.impl = impl;
    }*/
    Car impl;

    public CarWrapper2(Car car) {
        impl = car;
    }

    @Override
    public void run(URL url) {
        System.out.println("wrapper2 start car ...");
        impl.run(url);
        System.out.println("wrapper2 stop car ...");
    }
}
