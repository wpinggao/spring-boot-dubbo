package com.github.wpinggao.springboot.dubbo.provider.service.dubbo;

import com.github.wpinggao.springboot.dubbo.api.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author Wping.gao
 * @date 2020/3/28 11:11
 */
@Service(version = "1.0.0")
@Component
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
