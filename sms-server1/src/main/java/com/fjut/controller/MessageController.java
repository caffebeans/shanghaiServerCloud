package com.fjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MessageController {

    @RequestMapping("sendmessage")
    String sendMessage(){

        return "this is send message api";
    }
}
