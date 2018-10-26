package cn.rocker.springcloudeurekaclientconsumerfeign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rocker
 * @version V1.0
 * @Description:      创建一个Feign的客户端接口定义。使用@FeignClient注解来指定这个接口所要调用的服务名称，
 *                      接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口，
 *                      比如下面就是绑定eureka-client服务的/hello接口的例子
 * @date 2018/10/25 20:33
 */
@FeignClient("eureka-client")
public interface ConsumerClient {

    @GetMapping("/hello")
    String helloFeign();

}
