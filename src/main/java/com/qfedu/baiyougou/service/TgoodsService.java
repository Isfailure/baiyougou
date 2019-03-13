package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tgoods;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 14:48
 * @Version 1.0
 */
public interface TgoodsService {
    // 展示二级菜单下的所有商品
    ResultVo findAllGoods(int typeId);
    // 价格降序
    ResultVo findAllGoodByPrice(int typeId);
    // 价格升序
    ResultVo findAllGoodByPrice1(int typeId);
    // 销量
    ResultVo findAllGoodByPrice2(int typeId);
    ResultVo findGoods(int gid);
    //展示一级菜单下的所有商品
    ResultVo findAllGood(int pid);
    // 价格降序
    ResultVo findAllGood1(int pid);
    // 价格升序
    ResultVo findAllGood2(int pid);
    // 销量
    ResultVo findAllGood3(int pid);
    // 收藏
    ResultVo findAllGood4();
    // 根据城市展示商品
    ResultVo findByCountry(String country);

}
