package com.github.wpinggao.springboot.dubbo.consumer.controller;

import com.github.wpinggao.springboot.dubbo.consumer.service.EchoService;
import com.wping.component.base.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "echo", description = "回显测试", tags = {"common-echo"})
@RestController
@RequestMapping("/common/")
public class EchoController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/user/echo", method = RequestMethod.GET)
    @ApiOperation(value = "user-echo", httpMethod = "GET")
    public Result<String> userEcho(@RequestParam(value = "name") String name, @RequestParam(value = "num") Integer num) {
        return Result.success(echoService.userEcho(name, num));
    }




}
