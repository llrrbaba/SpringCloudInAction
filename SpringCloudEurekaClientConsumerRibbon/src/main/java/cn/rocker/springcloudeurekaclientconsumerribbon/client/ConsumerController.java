package cn.rocker.springcloudeurekaclientconsumerribbon.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author rocker
 * @version V1.0
 * @Description:    服务消费方
 * @date 2018/10/25 15:18
 */
@RestController
public class ConsumerController {

    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer")
    public String consume(){
        //TODO ribbon是如何做到传一个不带服务器IP和端口的url，就可以调用服务成功
        //TODO 翟永超大神说有拦截器实现的，这里我还有待研究
        String url = "http://eureka-client/hello";
        logger.info("url:{}",url);
        return restTemplate.getForObject(url,String.class);
    }

}
