package cn.liuyangjob.ExtsenloaderTest.api;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created by  liuyang
 * 2019/12/30    15:06
 * cn.liuyangjob.ExtsenloaderTest.api
 * All Right Reserved by liuyang.
 **/
@SPI("benz")
public interface Car {
    /**
     * 至少有一个方法被@Adaptive修饰
     * 被@Adaptive修饰得方法得参数 必须满足参数中有一个是URL类型，
     * 或者有至少一个参数有一个“公共且非静态的返回URL的无参get方法”
     * @param url  此处传入的url必须   url =  url.addParameter("car","benz");
     * @Adaptive注解中的值这里我叫它value，value可以是一个数组， 如果为空的话，vlaue等于接口名小写(例如接口名:cn.liuyangjob.ExtsenloaderTest.api.Car,
     * 那么value=car)
     */
    @Adaptive
    void run(URL url);

    void didi();
}
