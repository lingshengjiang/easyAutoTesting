package com.hry.mapper;

import com.hry.po.TiCustom;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/23 14:25
 */
public interface TiCustomMapper {
    List<TiCustom> selectByCondition(TiCustom tiCustom);
}
