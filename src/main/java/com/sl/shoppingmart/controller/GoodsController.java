package com.sl.shoppingmart.controller;

import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Good")
public class GoodsController {

  @Autowired
  private GoodsService goodsService;

  @RequestMapping("/test")
  public String test() {
    System.out.println("test");
    return "index";
  }
  @RequestMapping("/listGood")
  public R listGood(Integer page, Integer limit) {
    return goodsService.listGood(page,limit);
  }
}
