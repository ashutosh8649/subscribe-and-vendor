package com.offershopper.vendorprofileservice.feignproxy;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offershopper.vendorprofileservice.model.VendorDetailsBean;

@FeignClient(name = "user-database-service", url = "http://10.151.61.106:9001")
public interface UserProxy {

  @GetMapping("/users/details/{id}")
  public ResponseEntity<Optional<VendorDetailsBean>> findUserByEmail(@RequestParam String id);

}
