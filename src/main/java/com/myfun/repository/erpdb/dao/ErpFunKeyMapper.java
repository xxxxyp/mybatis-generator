package com.myfun.repository.erpdb.dao;

import com.myfun.repository.erpdb.po.ErpFunKey;
import com.myfun.repository.erpdb.po.ErpFunKeyExample;
import com.myfun.repository.support.mybatis.api.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Generated date 2020-11-19 16:34
*/
public interface ErpFunKeyMapper extends BaseMapper<ErpFunKey, ErpFunKey> {
    int countByExample(ErpFunKeyExample example);

    int deleteByExample(ErpFunKeyExample example);

    List<ErpFunKey> selectByExample(ErpFunKeyExample example);

    int updateByExampleSelective(@Param("record") ErpFunKey record, @Param("example") ErpFunKeyExample example);

    int updateByExample(@Param("record") ErpFunKey record, @Param("example") ErpFunKeyExample example);
}