package com.qfedu.baiyougou.service;

import com.qfedu.baiyougou.common.vo.ResultVo;

/**
 * @Author: wangjunqi
 * @Date: 2019/3/11 22:54
 * @Version 1.0
 */
public interface TgoodsTypeService {
    ResultVo queryByGrade(int grade);
    // 展示二级菜单
    ResultVo queryAll(int typeId);
}
