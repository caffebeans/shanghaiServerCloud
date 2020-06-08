package com.fjut.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "user-provider",fallback = HystrixTest.class)
public interface UserService {


      @PostMapping("/list")
      @ResponseBody
      String list(@RequestParam Map map);


}
