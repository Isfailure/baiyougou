package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.service.TgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 14:53
 * @Version 1.0
 */
@RestController
public class TgoodsController {
    @Autowired
    private TgoodsService tgoodsService;
    //展示二级菜单下的商品列表
    @GetMapping("goodsList.do")
    public ResultVo queryGoods(int typeId){
        return tgoodsService.findAllGoods(typeId);
    }
    // 按照价格降序
    @GetMapping("priceDesc.do")
    public ResultVo paixuGood(int typeId){
        return tgoodsService.findAllGoodByPrice(typeId);
    }
    // 按照价格升序
    @GetMapping("priceAsc.do")
    public ResultVo shengxuGood(int typeId){
        return tgoodsService.findAllGoodByPrice1(typeId);
    }
    // 按照销量降序
    @GetMapping("salesList.do")
    public ResultVo salesList(int typeId){
        return tgoodsService.findAllGoodByPrice2(typeId);
    }
    @GetMapping("goods.do")
    public ResultVo queryGood(int gid){
        return tgoodsService.findGoods(gid);
    }
    // 查看一级菜单下的所有商品
    @GetMapping("goodList.do")
    public ResultVo queryGood1(int pid){
        return tgoodsService.findAllGood(pid);
    }
    // 按照价格降序
    @GetMapping("goodList1.do")
    public ResultVo queryGood2(int pid){
        return tgoodsService.findAllGood1(pid);
    }
    // 按照价格升序
    @GetMapping("goodList2.do")
    public ResultVo queryGood3(int pid){
        return tgoodsService.findAllGood2(pid);
    }
    // 按照销量降序
    @GetMapping("goodList3.do")
    public ResultVo queryGood4(int pid){
        return tgoodsService.findAllGood3(pid);
    }
    // 收藏商品的全部展示
    @GetMapping("collectList.do")
    public ResultVo goooCollect(){
        return tgoodsService.findAllGood4();
    }
    // 根据地区展示所有商品
    @GetMapping("countryList.do")
    public  ResultVo countryList(String country){
        return tgoodsService.findByCountry(country);
    }

}
