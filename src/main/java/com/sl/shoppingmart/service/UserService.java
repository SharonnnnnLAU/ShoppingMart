package com.sl.shoppingmart.service;

import com.sl.shoppingmart.manager.result.R;

import javax.servlet.http.HttpServletRequest;

public interface UserService {


  R login(String userName, String userPwd, HttpServletRequest request);
}
