package com.fjut.controller;

import com.fjut.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

     @Autowired
     UserService service;

    @GetMapping("/list")
    @ResponseBody
    String list(@RequestParam Map map){
        System.out.println("-----");
        System.out.println("this is user-consumer list interface");
        System.out.println(map.size());
        String res=service.list(map);
        return res;
    }

}
