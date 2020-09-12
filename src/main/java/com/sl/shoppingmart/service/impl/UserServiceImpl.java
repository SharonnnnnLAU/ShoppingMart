package com.sl.shoppingmart.service.impl;


import com.sl.shoppingmart.dao.UserDao;
import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.manager.result.Status;
import com.sl.shoppingmart.model.vo.UserLoginVo;
import com.sl.shoppingmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public R login(String username, String password,  HttpServletRequest request) {
    UserLoginVo userLoginVo = userDao.selectByUserName(username);
    if (userLoginVo == null) {
      return R.Warn(Status.LOGIN_FAILED);
    } else if (password.equals(userLoginVo.getUPwd())) {
      System.out.println(userLoginVo);
      return R.Success(userLoginVo);
    } else
      return R.Warn(Status.LOGIN_FAILED);
  }
}
