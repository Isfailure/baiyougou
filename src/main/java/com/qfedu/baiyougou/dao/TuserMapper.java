package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.Tuser;
import org.apache.ibatis.annotations.Select;

public interface TuserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Tuser record);
    // 注册
    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
    // 登录
    @Select("select * from t_user where phone=#{phone}")
    Tuser selectByPhone(String phone);
}