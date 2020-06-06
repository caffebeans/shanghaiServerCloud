package com.fjut.controller;

import com.fjut.service.HealthStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @des: 用来对服务进行开头
 * @auth: zhang
 */
@Controller
public class HealthStatusController {

        @Autowired
        HealthStatusService healthStatusSrv;

        @GetMapping("/health")
        @ResponseBody
        public String health(@RequestParam("status") Boolean status) {

            System.out.println(status);

           healthStatusSrv.setStatus(status);
           return healthStatusSrv.getStatus();
        }

}
