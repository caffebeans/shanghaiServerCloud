package com.fjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

  @GetMapping("list")
  @ResponseBody
  String list(){
      System.out.println("this is user-provice list interface");
      return "user-provider";
  }


}
