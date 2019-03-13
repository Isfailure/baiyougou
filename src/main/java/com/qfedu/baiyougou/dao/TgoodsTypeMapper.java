package com.qfedu.baiyougou.dao;



import com.qfedu.baiyougou.common.vo.GoodsTypeVo;
import com.qfedu.baiyougou.entity.TgoodsType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TgoodsTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(TgoodsType record);

    int insertSelective(TgoodsType record);

    TgoodsType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(TgoodsType record);

    int updateByPrimaryKey(TgoodsType record);
    // 展示一级菜单
    @Select("select * from t_goodstype where grade=#{grade}")
    List<TgoodsType> selectByGrade(Integer grade);
    //展示二级菜单
    List<GoodsTypeVo> selectAll(Integer typeId);
}