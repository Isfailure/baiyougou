package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.sysconst.SystemCon;
import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tuser;
import com.qfedu.baiyougou.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/5 14:42
 * @Version 1.0
 */
@RestController
public class TuserController {

   @Autowired
   private TuserService userService;

    //登录
    @PostMapping("userlogin.do")
    public ResultVo login(String phone, String password, HttpSession session){
        ResultVo resultVo = userService.login(phone,password);
        if(resultVo.getCode()== SystemCon.OK){
            Tuser user = (Tuser) resultVo.getData();
            session.setAttribute("user",user);
        }
        return resultVo;
    }

    @PostMapping("useradd.do")
    public ResultVo addUser(Tuser user){
        return userService.register(user);
    }

}