package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.model.vo.UserLoginVo;
import com.sl.shoppingmart.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
  int deleteByPrimaryKey(Integer uId);

  int insert(User record);

  int insertSelective(User record);

  User selectByPrimaryKey(Integer uId);

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);

  UserLoginVo selectByUserName(String username);

  Integer getUidByUname(String username);


}
