package com.sl.shoppingmart.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sl.shoppingmart.dao.GoodsDao;
import com.sl.shoppingmart.manager.result.R;
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
  public R listGood(Integer page, Integer limit) {
    Page<GoodsListVo> pg = PageHelper.startPage(page,limit);
    List<GoodsListVo> goods = goodsDao.listGood();
    return R.Success((int)pg.getTotal(), goods);
  }
}
