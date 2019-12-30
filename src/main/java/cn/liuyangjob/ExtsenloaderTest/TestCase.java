package cn.liuyangjob.ExtsenloaderTest;

import cn.liuyangjob.ExtsenloaderTest.api.Car;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Created by  liuyang
 * 2019/12/30    16:33
 * cn.liuyangjob.ExtsenloaderTest
 * All Right Reserved by liuyang.
 **/

public class TestCase {
    public static void main(String[] args) {
       test();
    }
    public static void test() {
        // 默认 @SPI("honda") 为默认自动加载的自适应拓展
        ExtensionLoader<Car> mycarFactory = ExtensionLoader.getExtensionLoader(Car.class);
        Car mycar = mycarFactory.getDefaultExtension();
        mycar.run(null);
    }
    public static void test1() {
        //自适应点自动扩展加载
        ExtensionLoader<Car> mycarFactory = ExtensionLoader.getExtensionLoader(Car.class);
        Car mycar = mycarFactory.getAdaptiveExtension();
        mycar.run(null);
    }

}
