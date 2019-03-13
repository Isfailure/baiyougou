package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.GoodsTypeVo;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TgoodsMapper;
import com.qfedu.baiyougou.entity.Tgoods;
import com.qfedu.baiyougou.entity.TgoodsType;
import com.qfedu.baiyougou.service.TgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 14:48
 * @Version 1.0
 */
@Service
public class TgooodsServiceImpl implements TgoodsService {
    @Autowired
    private TgoodsMapper tgoodsMapper;
    @Override
    public ResultVo findAllGoods(int typeId) {
        List<Tgoods> list = tgoodsMapper.selectByTypeId(typeId);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGoodByPrice(int typeId) {
        List<Tgoods> list = tgoodsMapper.selectByPric(typeId);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGoodByPrice1(int typeId) {
        List<Tgoods> list = tgoodsMapper.selectByPric1(typeId);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGoodByPrice2(int typeId) {
        List<Tgoods> list = tgoodsMapper.selectBySals(typeId);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findGoods(int gid) {
        Tgoods tgoods = tgoodsMapper.selectByPrimaryKey(gid);
        if (tgoods != null){
            return  ResultUtil.exec(true,"OK",tgoods);
        }
        return  ResultUtil.exec(false,"没有这样的商品",null);
    }

    @Override
    public ResultVo findAllGood(int pid) {
        List<Tgoods> list = tgoodsMapper.selectByPid(pid);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGood1(int pid) {
        List<Tgoods> list = tgoodsMapper.selectByPrice(pid);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGood2(int pid) {
        List<Tgoods> list = tgoodsMapper.selectByPrice1(pid);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findAllGood3(int pid) {
        List<Tgoods> list = tgoodsMapper.selectBySales(pid);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }
    @Override
    public ResultVo findAllGood4() {
        List<Tgoods> list = tgoodsMapper.selectByCollect();
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }

    @Override
    public ResultVo findByCountry(String country) {
        List<Tgoods> list = tgoodsMapper.selectByCountry(country);
        if (list != null){
            return ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"此类菜单下面没有商品",null);
    }
}
