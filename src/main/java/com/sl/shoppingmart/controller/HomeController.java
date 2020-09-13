package com.sl.shoppingmart.controller;


import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.model.vo.UserLoginVo;
import com.sl.shoppingmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private UserService userService;

  @RequestMapping("/login")
  public R login(String userName, String userPwd, HttpServletRequest request) {
    return userService.login(userName, userPwd, request);
  }
//
  @RequestMapping("/index")
  public String index() {
    System.out.println("--> /home/index");
    return "login";
  }

//  @RequestMapping("/login")
//  public Integer login(String username, String password, String code, HttpServletRequest request) {
//    return userService.login(username, password, code, request);
//  }
//  @GetMapping("/login")
//  public ModelAndView login(ModelAndView modelAndView) {
//    modelAndView.setViewName("login");
//    return modelAndView;
//  }

//  @RequestMapping("/login")
//  public ModelAndView login(ModelAndView modelAndView, @Valid UserLoginVo userLoginVo, BindingResult bindingResult) {
//    if (bindingResult.hasErrors()) {
//      modelAndView.addObject("error", bindingResult.getFieldError().getDefaultMessage());
//      modelAndView.setViewName("catt");
//      System.out.println("11111");
//      return modelAndView;
//    }
//    System.out.println(userLoginVo);
//    String username = userLoginVo.getUName();
//    String password = userLoginVo.getUPwd();
//
//    if (!"justin".equals(username)) {
//      modelAndView.addObject("error", "用户名或密码错误");
//      modelAndView.setViewName("login");
//      System.out.println("22222");
//      return modelAndView;
//    }
//    if (!"adam".equals(password)) {
//      modelAndView.addObject("error", "账密错误");
//      modelAndView.setViewName("login");
//      System.out.println("33333");
//      return modelAndView;
//    }
//    modelAndView.addObject("username", username);
//    modelAndView.setViewName("catt");
//    System.out.println("44444");
//    return modelAndView;
//  }

//  @RequestMapping("/login")
//  public R login(String username, String password, String code, HttpServletRequest request) {
//    // 可以判断登陆前的先决条件
//    return userService.login(username, password, code, request);
//  }


//  @RequestMapping("/login")
//  public String index(){
//    return "login";
//  }
//
//  @ResponseBody
//  @RequestMapping("/catt")
//  public String catt() { return "catt";}

}
