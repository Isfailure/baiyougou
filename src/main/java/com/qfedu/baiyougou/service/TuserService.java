package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tuser;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/11 20:22
 * @Version 1.0
 */
public interface TuserService {

    //登录
    ResultVo login(String phone, String password);
    // 注册
    ResultVo register(Tuser user);

}
