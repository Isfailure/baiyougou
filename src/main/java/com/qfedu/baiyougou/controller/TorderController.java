package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Torder;
import com.qfedu.baiyougou.service.TorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/12 22:00
 * @Version 1.0
 */
@RestController
public class TorderController {
    @Autowired
    private TorderService torderService;

    @PostMapping("addTorder.do")
    public ResultVo addTorder(Torder torder){
        return torderService.insertOrder(torder);
    }

}
