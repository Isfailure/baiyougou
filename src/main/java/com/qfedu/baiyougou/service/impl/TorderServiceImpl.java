package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TorderMapper;
import com.qfedu.baiyougou.entity.Torder;
import com.qfedu.baiyougou.service.TorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 21:16
 * @Version 1.0
 */
@Service
public class TorderServiceImpl implements TorderService {
    @Autowired
    private TorderMapper torderMapper;

    @Override
    public ResultVo insertOrder(Torder torder) {
        int i = torderMapper.insertSelective(torder);
        if(i != 0){
            return  ResultUtil.exec(true,"OK",null);

        }
        return ResultUtil.exec(false,"订单添加失败",null);
    }
}
