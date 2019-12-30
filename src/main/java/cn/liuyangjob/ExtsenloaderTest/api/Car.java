package cn.liuyangjob.ExtsenloaderTest.api;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created by  liuyang
 * 2019/12/30    15:06
 * cn.liuyangjob.ExtsenloaderTest.api
 * All Right Reserved by liuyang.
 **/
@SPI("honda")
public interface Car {
    void run(URL url);
    void didi();
}
