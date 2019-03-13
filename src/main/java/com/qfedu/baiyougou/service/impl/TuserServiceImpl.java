package com.qfedu.baiyougou.service.impl;

import com.qfedu.baiyougou.common.util.ResultUtil;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.dao.TuserMapper;
import com.qfedu.baiyougou.entity.Tuser;
import com.qfedu.baiyougou.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/11 21:14
 * @Version 1.0
 */
@Service
public class TuserServiceImpl implements TuserService {

    @Autowired
    private TuserMapper userMapper;
    @Override
    public ResultVo login(String phone, String password) {
        Tuser user=userMapper.selectByPhone(phone);
        if(user!=null){
            //Objects.equals(user.getPassword(),password);  jdk8 提供的工具类
            if(user.getPassword().equals(password)){
                //登录成功
                return ResultUtil.exec(true,"OK",user);
            }
        }
        return ResultUtil.exec(false,"手机号或密码不正确",null);
    }

    @Override
    public ResultVo register(Tuser user) {
        Tuser user1 = userMapper.selectByPhone(user.getPhone());
        if (user1 == null) {
            userMapper.insertSelective(user);
            // 添加成功
            return ResultUtil.exec(true, "Ok", null);
        }
            // 注册失败
            return ResultUtil.exec(false,"手机号已被注册，请重新注册",null);
    }
}
