package cn.liuyangjob.ExtsenloaderTest.carimpl;

import cn.liuyangjob.ExtsenloaderTest.api.Car;
import com.alibaba.dubbo.common.URL;

/**
 * Created by  liuyang
 * 2019/12/30    15:09
 * cn.liuyangjob.ExtsenloaderTest.carimpl
 * All Right Reserved by liuyang.
 **/

public class HondaCar extends AbstarctCar implements Car{
    @Override
    public void run(URL url) {
        System.out.println("Honda run");
    }
}
