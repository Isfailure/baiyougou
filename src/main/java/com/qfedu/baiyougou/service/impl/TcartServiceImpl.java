package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TcartMapper;
import com.qfedu.baiyougou.entity.Tcart;
import com.qfedu.baiyougou.service.TcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 8:41
 * @Version 1.0
 */
@Service
public class TcartServiceImpl implements TcartService {
    @Autowired
    private TcartMapper tcartMapper;
    @Override
    public ResultVo addCart(Tcart tcart) {
        int i = tcartMapper.insertSelective(tcart);
        if (i != 0){
            return ResultUtil.exec(true,"OK",null);
        }
        return ResultUtil.exec(false,"购物车添加失败",null);
    }

    @Override
    public ResultVo delectCart(int uid, int gid) {
        int i = tcartMapper.deleteByGid(gid,uid);
        if (i != 0){
            return ResultUtil.exec(true,"OK",null);
        }
        return ResultUtil.exec(false,"删除购物车失败",null);
    }
}
