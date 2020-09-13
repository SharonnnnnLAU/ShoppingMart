package com.sl.shoppingmart.controller;

import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.service.ShCaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SC")
public class ShCaController {

  @Autowired
  private ShCaService shCaService;

  @RequestMapping("/listSC")
  public R listSC(Integer scid) {
    return shCaService.listSC(scid);
  }

  @RequestMapping("/addCar")
  public R addCar(Integer gid, Integer gnum, Integer scid) {
    return shCaService.addCar(gid, gnum, scid);
  }
}
