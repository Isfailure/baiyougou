package com.qfedu.baiyougou.controller;

import com.qfedu.baiyougou.common.vo.ResultVo;
import com.qfedu.baiyougou.entity.Tcollect;
import com.qfedu.baiyougou.service.TcollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/13 0:36
 * @Version 1.0
 */
@RestController
public class TcollectController {
    @Autowired
    private TcollectService tcollectService;

    @PostMapping("addCollect.do")
    public ResultVo addCollect(Tcollect tcollect){
        return tcollectService.addColect(tcollect);
    }
    @PostMapping("delectCollect.do")
    public ResultVo delectCollect(int gid,int uid){
        return tcollectService.delectCollect(uid,gid);
    }
}
