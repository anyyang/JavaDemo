package cn.liuyangjob.ExtsenloaderTest;

import cn.liuyangjob.ExtsenloaderTest.api.Car;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;

/**
 * Created by  liuyang
 * 2019/12/30    16:33
 * cn.liuyangjob.ExtsenloaderTest
 * All Right Reserved by liuyang.
 **/

public class TestCase {
    public static void main(String[] args) {
      //  JDKLoader();
        SPILoader();
    }

    /**
     * jdkLoader从/META-INF/services/cn.liuyangjob.ExtsenloaderTest.api.Car中取值
     * jdk load   为什么不好用？
     * 1 ，全部加载所有扩展点
     * 2，不灵活代码需要写死
     * 3，不支持AOP和IOC
     */
    public static void JDKLoader() {
        ServiceLoader<Car> loader =ServiceLoader.load(Car.class);
        for (Car car : loader){
            car.run(null);
        }
    }

    /**
     * SPIloader 从META-INF/dubbo/cn.liuyangjob.ExtsenloaderTest.api.Car 中取值
     */
    public static void SPILoader() {
        // 默认 @SPI("honda") 为默认自动加载的自适应拓展
        ExtensionLoader<Car> mycarFactory = ExtensionLoader.getExtensionLoader(Car.class);
        Car mycar = mycarFactory.getAdaptiveExtension();
        URL url=  URL.valueOf("Driver://liuyang");
        url =  url.addParameter("car","benz");
        mycar.run(url);
    }
    public static void test1() {
        //自适应点自动扩展加载
        ExtensionLoader<Car> mycarFactory = ExtensionLoader.getExtensionLoader(Car.class);
        Car mycar = mycarFactory.getAdaptiveExtension();
        mycar.run(null);
    }

}
