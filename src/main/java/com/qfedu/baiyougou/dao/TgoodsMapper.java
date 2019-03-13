package com.qfedu.baiyougou.dao;

import com.qfedu.baiyougou.entity.Tgoods;
import org.apache.ibatis.annotations.Select;

import javax.validation.constraints.Size;
import java.util.List;

public interface TgoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Tgoods record);

    int insertSelective(Tgoods record);

    Tgoods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Tgoods record);

    int updateByPrimaryKey(Tgoods record);
    // 展示二级菜单下的商品
    @Select("select * from t_goods where typeId=#{typeId}")
    List<Tgoods> selectByTypeId(int typeId);
    // 按照价格的降序排列二级菜单下的商品
    @Select("select * from t_goods where typeId=#{typeId} order by price desc")
    List<Tgoods> selectByPric(int typeId);
    // 按照价格的升序排列二级菜单下的商品
    @Select("select * from t_goods where typeId=#{typeId} order by price asc")
    List<Tgoods> selectByPric1(int typeId);
    // 按照销量的降序排列二级菜单下的商品
    @Select("select * from t_goods where typeId=#{typeId} order by sales desc")
    List<Tgoods> selectBySals(int typeId);
    //展示一级菜单下的所有商品
    List<Tgoods> selectByPid(int pid);
    // 按照价格的降序排列一级菜单下的商品
    List<Tgoods> selectByPrice(int pid);
    // 按照价格的升序排列一级菜单下的商品
    List<Tgoods> selectByPrice1(int pid);
    // 按照销量的降序排列一级菜单下的商品
    List<Tgoods> selectBySales(int pid);
    // 展示收藏里面的商品
    List<Tgoods> selectByCollect();
    // 根据地区展示所有商品
    @Select("select * from t_goods where country=#{country}")
    List<Tgoods> selectByCountry(String country);

}