package cn.rocker.springcloudeurekaclient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author rocker
 * @version V1.0
 * @Description:    服务提供方
 * @date 2018/10/24 15:06
 */
@RestController
public class Hello {

    private final Logger logger = LoggerFactory.getLogger(Hello.class);

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String hello(){
        String services = "Services:" + discoveryClient.getServices();
        logger.info(services);
        return services;
    }

}
