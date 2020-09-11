package com.sl.shoppingmart.controller;

import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.model.vo.GoodsListVo;
import com.sl.shoppingmart.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Good")
public class GoodsController {

  @Autowired
  private GoodsService goodsService;

//  @RequestMapping("/test")
//  public String test() {
//    System.out.println("test");
//    return "index";
//  }

  @RequestMapping("/listGood")
  public R listGood() {
    return goodsService.listGood();
  }

  /**
   * 商品类型 0:coat 1:plants 2:shirt 3:shoes 4:skirt
   */

  @RequestMapping("/coatType")
  public R coatType() { return goodsService.typeGood(0);}

  @RequestMapping("/plantsType")
  public R plantsType() { return goodsService.typeGood(1);}

  @RequestMapping("/shirtType")
  public R shirtType() { return goodsService.typeGood(2);}

  @RequestMapping("/shoesType")
  public R shoesType() { return goodsService.typeGood(3);}

  @RequestMapping("/skirtType")
  public R skirtType() { return goodsService.typeGood(4);}

  @RequestMapping("/goodsDetail")
  public R goodsDetail(Integer gId) {return goodsService.goodsDetail(gId);}
}
