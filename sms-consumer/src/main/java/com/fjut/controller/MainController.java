package com.fjut.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

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
         String res=restTemplate.getForObject(url,String.class);
         System.out.println(res);

//        if(instances.size()>0) {
//            // 服务
//            InstanceInfo instanceInfo = instances.get(0);
//            if(instanceInfo.getStatus() == InstanceInfo.InstanceStatus.UP) {
//
//                String url =	"http://" + instanceInfo.getHostName() +":"+ instanceInfo.getPort() + "/getHi";
//
//                System.out.println("url:" + url);
//
//                RestTemplate restTemplate = new RestTemplate();
//
//                String respStr = restTemplate.getForObject(url, String.class);
//
//                System.out.println("respStr"  + respStr);
//            }
//
//        }
        return "xxoo";
    }




}
