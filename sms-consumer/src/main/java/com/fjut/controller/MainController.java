package com.fjut.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Resource
    EurekaClient client;

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/client")
    @ResponseBody
    public String client() {

        List<InstanceInfo> instances = client.getInstancesByVipAddress("sms-server", false);



        for (InstanceInfo ins : instances) {
//            System.out.println(ToStringBuilder.reflectionToString(ins));
        }

        if (instances.size()>0){

             System.out.println(instances.size());
        }
//
        String url = "http://127.0.0.1:8000/sendmessage";
        ResponseEntity<String> res = restTemplate.getForEntity(url, String.class);
         System.out.println(res);
        return "sdsds";
    }


    @GetMapping("/getMap")
    @ResponseBody
    public Map getMap() {

        String url = "http://127.0.0.1:8000/getMap";
        Map res = restTemplate.getForObject(url, Map.class);
        System.out.println(res);
        return res;
    }

    /**
     *
     * @return obj
     * @des: 返回一个对象的操作
     */

    @GetMapping("/getObject")
    @ResponseBody
    public Object getObject() {

        List<InstanceInfo> instances = client.getInstancesByVipAddress("sms-server", false);
        String url = "http://127.0.0.1:8000/getObject";
        Object object= restTemplate.getForObject(url,Object.class);
        System.out.println(object);
        return object;
    }


    @GetMapping("/postObj")
    @ResponseBody
    public Object postObj() {

        List<InstanceInfo> instances = client.getInstancesByVipAddress("sms-server", false);
        Map map = new HashMap();
        map.put("id", "20192343");
        map.put("name", "zhangsan");
        String url = "http://127.0.0.1:8000/postObj";
        String res=restTemplate.postForObject(url,map,String.class);
        System.out.println(res);
        return res;
    }



}
