package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.service.TviewPagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 15:44
 * @Version 1.0
 */
@RestController
public class TviewPagerController {
    @Autowired
    private TviewPagerService tviewPagerService;
    @GetMapping("viewPager.do")
    public ResultVo findViewByGid(int gid){
        return tviewPagerService.findByGid(gid);
    }
}
