package com.sl.shoppingmart.dao;

import com.sl.shoppingmart.model.vo.SCGoodVo;
import com.sl.shoppingmart.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCartDao {
  int deleteByPrimaryKey(Integer scId);

  int insert(ShoppingCart record);

  int insertSelective(ShoppingCart record);

  ShoppingCart selectByPrimaryKey(Integer scId);

  int updateByPrimaryKeySelective(ShoppingCart record);

  int updateByPrimaryKey(ShoppingCart record);

  List<SCGoodVo> listSC(Integer scid);

  ShoppingCart isExistGood(@Param("scid") Integer scid, @Param("gid") Integer gid);

  Integer updateScNum(@Param("gid") Integer gid, @Param("gnum") Integer gnum, @Param("scid") Integer scid);

  Integer insertScGood(@Param("gid") Integer gid, @Param("gnum") Integer gnum, @Param("scid") Integer scid);
}
