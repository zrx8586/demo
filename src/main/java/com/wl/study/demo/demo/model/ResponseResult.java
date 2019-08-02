
package com.wl.study.demo.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 3449934794766090510L;
    @ApiModelProperty("状态")
    private int status = 200;
    @ApiModelProperty("消息")
    private String message = "成功";
    @ApiModelProperty("结果")
    private T data;

    public ResponseResult() {
    }

    public int getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "ResponseResult(status=" + this.getStatus() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}