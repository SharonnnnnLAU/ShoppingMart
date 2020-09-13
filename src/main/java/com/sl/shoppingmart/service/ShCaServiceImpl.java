package com.sl.shoppingmart.service;


import com.sl.shoppingmart.dao.ShoppingCartDao;
import com.sl.shoppingmart.manager.result.R;
import com.sl.shoppingmart.manager.result.Status;
import com.sl.shoppingmart.model.vo.SCGoodVo;
import com.sl.shoppingmart.pojo.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShCaServiceImpl implements ShCaService {

  @Autowired
  private ShoppingCartDao shoppingCartDao;
//  private ShoppingCartDao shoppingCartDao;

  @Override
  public R listSC(Integer scid) {
//    return null;
    System.out.println("scid is" + scid);
    List<SCGoodVo> scGoods = shoppingCartDao.listSC(scid);
    System.out.println(scGoods);
    return R.Success(scGoods);
  }


  @Override
  public R addCar(Integer gid, Integer gnum, Integer scid) {
    ShoppingCart already = shoppingCartDao.isExistGood(scid, gid);
    if (already != null){
      Integer res = shoppingCartDao.updateScNum(gid, gnum, scid);
      if (res == 1)
        return R.Success();
      else
        return R.Warn(Status.DB_OPERATE_FAILED);
    }
    else {
      Integer ress = shoppingCartDao.insertScGood(gid, gnum, scid);
      if (ress == 1)
        return R.Success();
      else
        return R.Warn(Status.DB_OPERATE_FAILED);
    }
  }
}
