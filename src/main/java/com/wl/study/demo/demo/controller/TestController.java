package com.wl.study.demo.demo.controller;

import com.wl.study.demo.demo.model.ResponseResult;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: study-demo
 * @description: 测试Controller
 **/
@RestController
@RequestMapping("/test")
@Slf4j
@Api(value = "solidsnake-test", description = "测试", tags = {"Test",})
public class TestController {

    @GetMapping(value = "/testMethod", produces = {"application/json"})
    @ApiOperation(value = "testMethod", notes = "测试方法")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "返回结果", response = ResponseResult.class)})
    public ResponseResult testMethod(@ApiParam(value = "输入值", required = true) @RequestParam String input) {

        ResponseResult responseResult = new ResponseResult();

        responseResult.setData(input);
        responseResult.setMessage("testMethod");
        responseResult.setStatus(200);

        return responseResult;
    }

    @GetMapping(value = "/testJson", produces = {"application/json"})
    @ApiOperation(value = "testJson", notes = "testJson")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "返回结果", response = ResponseResult.class)})
    public ResponseResult testJson(@ApiParam(value = "输入值", required = true) @RequestParam String input) {

        ResponseResult responseResult = new ResponseResult();


        return responseResult;
    }


}
