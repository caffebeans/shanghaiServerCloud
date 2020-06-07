package com.fjut.controller;

import com.fjut.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;

@Controller
public class MainController {

     @Autowired
     UserService service;

    @GetMapping("/list")
    @ResponseBody
    String list(){
        System.out.println("-----");
        System.out.println("this is user-consumer list interface");
        String res=service.list();
        return res;
    }

}
