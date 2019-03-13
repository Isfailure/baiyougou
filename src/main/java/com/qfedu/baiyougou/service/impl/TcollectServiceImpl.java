package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TcollectMapper;
import com.qfedu.baiyougou.entity.Tcollect;
import com.qfedu.baiyougou.service.TcollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 0:34
 * @Version 1.0
 */
@Service
public class TcollectServiceImpl implements TcollectService {
    @Autowired
    private TcollectMapper tcollectMapper;
    @Override
    public ResultVo addColect(Tcollect tcollect) {
        int id = tcollectMapper.insertSelective(tcollect);
        if (id != 0){
            return ResultUtil.exec(true,"OK",null);
        }
        return ResultUtil.exec(false,"收藏商品失败",null);
    }

    @Override
    public ResultVo delectCollect(int uid, int gid) {
        int i = tcollectMapper.deleteByGid(gid,uid);
        if (i != 0){
            return ResultUtil.exec(true,"OK",null);
        }
        return ResultUtil.exec(false,"取消收藏失败",null);
    }
}
