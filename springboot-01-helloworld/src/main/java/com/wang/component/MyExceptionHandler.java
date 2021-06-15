package com.wang.component;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    //@ResponseBody
    @ExceptionHandler
    public String handleException(Exception e, HttpServletRequest request){

        //设置错误状态码：4xx 5xx
        request.setAttribute("javax.servlet.errors.status_code",500);


        Map<String,Object> map = new HashMap<>();
        map.put("code","4000");
        map.put("message","系统异常");
        request.setAttribute("ext",map);

        //转发到/error
        return "forward:/error";
    }
}
