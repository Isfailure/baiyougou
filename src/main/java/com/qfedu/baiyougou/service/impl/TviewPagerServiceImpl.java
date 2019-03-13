package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TviewPagerMapper;
import com.qfedu.baiyougou.entity.TviewPager;
import com.qfedu.baiyougou.service.TviewPagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 15:41
 * @Version 1.0
 */
@Service
public class TviewPagerServiceImpl implements TviewPagerService {
    @Autowired
    private TviewPagerMapper tviewPagerMapper;
    @Override
    public ResultVo findByGid(int gid) {
        List<TviewPager> list = tviewPagerMapper.selectAllByGid(gid);
        if (list != null){
            return ResultUtil.exec(true,"OK",list);
        }
        return ResultUtil.exec(false,"你所需要的资源不存在",null);
    }
}
