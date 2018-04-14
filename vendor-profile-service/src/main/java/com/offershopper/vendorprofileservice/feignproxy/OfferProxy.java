package com.offershopper.vendorprofileservice.feignproxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.offershopper.vendorprofileservice.model.OfferBean;
@FeignClient(name="offer-database-service", url="http://10.151.61.121:9002")
public interface OfferProxy {
  
  @GetMapping("/offers")
  public ResponseEntity<List<OfferBean>> getOffers(); 
}
