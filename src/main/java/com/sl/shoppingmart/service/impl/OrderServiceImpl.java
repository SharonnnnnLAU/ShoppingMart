package com.sl.shoppingmart.service.impl;


import com.sl.shoppingmart.dao.OrderDao;
import com.sl.shoppingmart.dao.UserDao;
import com.sl.shoppingmart.dao.OrderGoodDao;
import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.manager.result.Status;
import com.sl.shoppingmart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderDao orderDao;
  @Autowired
  private UserDao userDao;
  @Autowired
  private OrderGoodDao orderGoodDao;

  @Override
  public R addGood(Integer gid, Integer gnum, String username) {
    Integer uid = userDao.getUidByUname(username);
    Integer oid = orderDao.addOrder(uid);
    Integer res = orderGoodDao.addGood(gid, gnum, oid);
    if (res == 1)
      return R.Success();
    else
      return R.Warn(Status.DB_OPERATE_FAILED);
  }

}
