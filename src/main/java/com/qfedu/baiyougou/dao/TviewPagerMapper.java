package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.TviewPager;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TviewPagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TviewPager record);

    int insertSelective(TviewPager record);

    TviewPager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TviewPager record);

    int updateByPrimaryKey(TviewPager record);
    @Select("select * from t_viewpager where gid=#{gid}")
    List<TviewPager> selectAllByGid(int gid);
}