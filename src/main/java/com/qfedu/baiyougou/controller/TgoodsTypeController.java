package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.sysconst.SystemCon;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tuser;
import com.qfedu.baiyougou.service.TgoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/11 23:34
 * @Version 1.0
 */
@RestController
public class TgoodsTypeController {

    @Autowired
    private TgoodsTypeService tgoodsTypeService;

    //展示一级菜单
    @GetMapping("menulist.do")
    public ResultVo queryMenu(int grade){
        return tgoodsTypeService.queryByGrade(grade);
    }
    // 展示一级菜单对应的二级菜单
    //展示一级菜单
    @GetMapping("goodsTypeList.do")
    public ResultVo queryGoodsType(int typeId){
        return tgoodsTypeService.queryAll(typeId);
    }
}
