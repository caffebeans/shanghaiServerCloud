package com.fjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.Map;

@Controller
public class UserController {

  @PostMapping("list")
  @ResponseBody
  String list(@RequestParam Map map){
      System.out.println("this is user-provice list interface");
      System.out.println(map.get("id"));
      return "user-provider";
  }


}
