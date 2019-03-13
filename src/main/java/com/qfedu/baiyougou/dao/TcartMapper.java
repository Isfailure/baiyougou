package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.Tcart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface TcartMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Tcart record);
    // 添加购物车
    int insertSelective(Tcart record);

    Tcart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Tcart record);

    int updateByPrimaryKey(Tcart record);
    // 根据商品号来删除购物车
    @Delete("delete from t_cart where gid=#{gid} and uid=#{uid}")
    int deleteByGid(@Param("gid") int gid, @Param("uid") int uid);
}