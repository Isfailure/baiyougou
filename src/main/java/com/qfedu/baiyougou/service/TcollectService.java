package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tcollect;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 0:33
 * @Version 1.0
 */
public interface TcollectService {
    ResultVo addColect(Tcollect tcollect);

    ResultVo delectCollect(int uid,int gid);
}
