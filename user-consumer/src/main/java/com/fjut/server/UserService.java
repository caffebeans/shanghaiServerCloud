package com.fjut.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "user-provider",url = "http://localhost:8005")
public interface UserService {


      @GetMapping("/list")
      @ResponseBody
      String list();


}
