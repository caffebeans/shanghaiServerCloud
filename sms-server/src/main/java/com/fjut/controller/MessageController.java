package com.fjut.controller;

import com.fjut.model.Person;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RestController
public class MessageController {

    @RequestMapping("sendmessage")
    String sendMessage(){

        return "sms1";
    }

    @RequestMapping("getMap")
    Map<String,String> getMap(){

        Map map = new HashMap();
        map.put("name", "zhangliang");

        return map;
    }

    @RequestMapping("getObject")
    Object getObject(){

        Person person = new Person();
        person.setId(12);
        person.setName("zhangsan");

        return person;
    }
    @RequestMapping("postObj")
    Object postObj(@RequestBody Map map){

         System.out.println("-----------");
        System.out.println(map);
        System.out.println(map.size());

        return "dfdf";
    }




}
