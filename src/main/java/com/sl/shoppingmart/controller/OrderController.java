package com.sl.shoppingmart.controller;

import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @RequestMapping("/addGood")
  public R addGood(Integer gid, Integer gnum, String username) {
    return orderService.addGood(gid, gnum, username);
  }
}
