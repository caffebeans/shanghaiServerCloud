package com.fjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MessageController {

    @RequestMapping("sendmessage")
    String sendMessage(){

        System.out.println("this is send message1 api");
        return "sms2";
    }


}
