package com.github.wpinggao.springboot.dubbo.consumer.controller;

import com.github.wpinggao.springboot.dubbo.consumer.service.EchoService;
import com.github.wpinggao.springboot.dubbo.consumer.service.HelloService;
import com.wping.component.base.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "回显测试", tags = {"common-echo"})
@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    @ApiOperation(value = "echo", httpMethod = "GET")
    public Result<String> userEcho(@RequestParam(value = "name") String name, @RequestParam(value = "num") Integer num) {
        return Result.success(echoService.userEcho(name, num));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation(value = "hello", httpMethod = "GET")
    public Result<String> hello(@RequestParam(value = "name") String name) {
        return Result.success(helloService.hello(name));
    }




}
