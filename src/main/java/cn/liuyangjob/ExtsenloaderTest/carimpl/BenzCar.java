package cn.liuyangjob.ExtsenloaderTest.carimpl;

import cn.liuyangjob.ExtsenloaderTest.api.Car;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

/**
 * Created by  liuyang
 * 2019/12/30    15:09
 * cn.liuyangjob.ExtsenloaderTest.carimpl
 * All Right Reserved by liuyang.
 **/
@Adaptive
public class BenzCar extends AbstarctCar implements Car {
    @Override
    public void run(URL url) {
        System.out.println("Benz run");
    }
}
