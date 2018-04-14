package com.offershopper.subscribedatabaseservice.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offershopper.subscribedatabaseservice.database.SubscribeRepository;
import com.offershopper.subscribedatabaseservice.model.SubscribeBean;
import com.offershopper.subscribedatabaseservice.service.MessageSender;

@RestController
@RequestMapping("/subscribe")
public class SubscribeController {

  @Autowired
  private MessageSender sendMessageToRabbit;

  private SubscribeRepository subscribeRepository;

  public SubscribeController(SubscribeRepository subscribeRepository) {
    this.subscribeRepository = subscribeRepository;

  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   * Discription: This method retrieves subscription from the database for a specific user 
   * Req. Files/Databases: SubscribeBean.class,MessageSender.class
   */
  @HystrixCommand(fallbackMethod = "getFallback")
  @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<SubscribeBean> getAll() {
    String msg = "getting subscription data";
    sendMessageToRabbit.produceMsg(msg);
    return subscribeRepository.findAll();

  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   * Discription: if the above method throws exception then call this method 
   * Req. Files/Databases: MessageSender.class
   */
  public List<SubscribeBean> getFallback() {
    String msg = "Exception occured, inside fallback";
    sendMessageToRabbit.produceMsg(msg);
    return Collections.emptyList();
  }
  
  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018 
   * Discription: if the above method throws exception then call this method 
   * Req. Files/Databases: MessageSender.class
   */
  @HystrixCommand(fallbackMethod = "getByIdFallback")
  @GetMapping(value = "/get/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Optional<SubscribeBean> getById(@PathVariable String userId) {
    String msg = "getting subscription data";
    sendMessageToRabbit.produceMsg(msg);
    return subscribeRepository.findById(userId);

  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   *  Discription: if the above method throws exception then call this  method 
   * Req. Files/Databases: MessageSender.class
   */
  
  public Optional<SubscribeBean> getByIdFallback(@PathVariable String userId) {
    String msg = "Exception occured, inside fallback";
    sendMessageToRabbit.produceMsg(msg);
    return Optional.empty();

  }


  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   * Discription: This method add subscription to database .
   * Req .Files/Databases: MessageSender.class
   */
  @HystrixCommand(fallbackMethod = "addFallback")
  @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<HttpStatus> addSubscribeBean(@RequestBody SubscribeBean subscribeBean) {

    Optional<SubscribeBean> option = subscribeRepository.findById(subscribeBean.getUserId());
    if (option.isPresent()) {
      System.out.println("this product is already existing");
      return new ResponseEntity<>(HttpStatus.CONFLICT);

    }

    subscribeRepository.insert(subscribeBean);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   * Discription: if the above method throws exception then call this method 
   * Req. Files/Databases: MessageSender.class
   */
  public ResponseEntity<HttpStatus> addFallback(@RequestBody SubscribeBean subscribeBean) {
    String msg = "Exception occured, inside fallback";
    sendMessageToRabbit.produceMsg(msg);
    return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018
   * Discription: delete any subscription entry 
   * Req. Files/Databases:MessageSender.class
   */
  @HystrixCommand(fallbackMethod = "delFallback")
  @DeleteMapping(value = "/del/{userId}")
  public ResponseEntity<HttpStatus> delete(@PathVariable("userId") String userId) {
    Optional<SubscribeBean> option = subscribeRepository.findById(userId);
    if (option.isPresent()) {
      subscribeRepository.delete(option.get());
      return new ResponseEntity<>(HttpStatus.OK);
    } else
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  /*
   * Name: Subscription Module 
   * Author:Ashutosh Kumar Mishra, Dinesh Verma 
   * Date:7th Apr,2018 
   * Discription: if the above method throws exception then call this method 
   * Req. Files/Databases: MessageSender.class
   */
  public ResponseEntity<HttpStatus> delFallback(@PathVariable("userId") String userId) {
    String msg = "Exception occured, inside fallback";
    sendMessageToRabbit.produceMsg(msg);
    return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
  }

}
