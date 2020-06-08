package com.fjut.server;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HystrixTest implements UserService{


    @Override
    public String list(Map map) {
        System.out.println("调用过程发生了错误");
        return "调用失败";
    }
}
