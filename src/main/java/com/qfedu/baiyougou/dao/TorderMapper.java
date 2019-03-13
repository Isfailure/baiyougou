package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.Torder;

public interface TorderMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Torder record);
    // 添加商品订单
    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}