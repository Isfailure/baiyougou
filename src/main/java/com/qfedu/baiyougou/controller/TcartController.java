package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tcart;
import com.qfedu.baiyougou.service.TcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 8:43
 * @Version 1.0
 */
@RestController
public class TcartController {
    @Autowired
    private TcartService tcartService;
    @PostMapping("addCart.do")
    public ResultVo addCart(Tcart tcart){
        return tcartService.addCart(tcart);
    }
    @PostMapping("delectCart.do")
    public ResultVo delectCart(int gid,int uid){
        return tcartService.delectCart(uid,gid);
    }
}
