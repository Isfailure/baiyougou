package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.GoodsTypeVo;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TgoodsTypeMapper;
import com.qfedu.baiyougou.entity.TgoodsType;
import com.qfedu.baiyougou.service.TgoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/11 22:54
 * @Version 1.0
 */
@Service
public class TgoodsTypeServiceImpl implements TgoodsTypeService {

    @Autowired
    private TgoodsTypeMapper goodsTypeMapper;
    @Override
    public ResultVo queryByGrade(int grade) {
        List<TgoodsType> list = goodsTypeMapper.selectByGrade(grade);
        if (list != null){
            return ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"没有此类菜单",null);
    }

    @Override
    public ResultVo queryAll(int typeId) {
        List<GoodsTypeVo> list = goodsTypeMapper.selectAll(typeId);
        if (list != null){
            return  ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"没有此分类菜单",null);
    }
}
