package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tcart;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 8:40
 * @Version 1.0
 */
public interface TcartService {
    ResultVo addCart(Tcart tcart);

    ResultVo delectCart(int uid,int gid);
}
