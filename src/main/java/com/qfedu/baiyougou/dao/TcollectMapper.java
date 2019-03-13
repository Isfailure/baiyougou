package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.Tcollect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TcollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tcollect record);
    // 添加收藏
    int insertSelective(Tcollect record);

    Tcollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tcollect record);

    int updateByPrimaryKey(Tcollect record);
    // 根据商品号来取消收藏
    @Delete("delete from t_collect where gid=#{gid} and uid=#{uid}")
    int deleteByGid(@Param("gid") int gid, @Param("uid") int uid);

}