/*package com.offershopper.subscribedatabaseservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="uaa-server" , url ="http://10.151.61.153:7000")
@RibbonClient("uaa-server")
public interface UAAProxy {
  
  
  @GetMapping("/verifytoken/{token}")
  public String verifyTokenComingFromService(@PathVariable(value="token") String token);

}
*/