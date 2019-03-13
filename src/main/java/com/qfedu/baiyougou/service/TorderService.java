package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Torder;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 21:15
 * @Version 1.0
 */
public interface TorderService {
    ResultVo insertOrder(Torder torder);
}
