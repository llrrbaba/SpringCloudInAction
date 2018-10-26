package cn.rocker.springcloudeurekaclientconsumerfeign.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/10/26 11:21
 */
@RestController
public class ConsumerController {

    @Resource
    private ConsumerClient consumerClient;

    @GetMapping("/consumer")
    public String feignConsume(){
        return consumerClient.helloFeign();
    }

}
