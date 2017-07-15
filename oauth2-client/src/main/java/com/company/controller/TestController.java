package com.company.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 */
@RestController
@RequestMapping("/api")
@Api(description = "测试",tags = {"测试"})
public class TestController {

    @PostMapping("/test")
    @ApiOperation(value = "测试接口", notes = "测试")
    public String test(){
        return "success";
    }

}
