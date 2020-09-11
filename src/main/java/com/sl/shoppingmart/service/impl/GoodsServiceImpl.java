package com.sl.shoppingmart.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sl.shoppingmart.dao.GoodsDao;
import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.manager.result.Status;
import com.sl.shoppingmart.model.vo.GoodsDetailVo;
import com.sl.shoppingmart.model.vo.GoodsListVo;
import com.sl.shoppingmart.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

  @Autowired
  GoodsDao goodsDao;

  @Override
  public R listGood() {
    List<GoodsListVo> goods = goodsDao.listGood();
    return R.Success(goods);
  }

  @Override
  public R typeGood(Integer type) {
    List<GoodsListVo> typeGoods = goodsDao.typeGood(type);
    return R.Success(typeGoods);
  }

  @Override
  public R goodsDetail(Integer gId) {
    GoodsDetailVo goodDetail = goodsDao.goodsDetail(gId);
    if (goodDetail == null)
      return R.Error(Status.ARGS_NOT_ALLOW_NULL);
    return R.Success(goodDetail);
  }
}
