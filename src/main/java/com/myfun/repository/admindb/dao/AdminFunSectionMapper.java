package com.myfun.repository.admindb.dao;

import com.myfun.repository.admindb.po.AdminFunSection;
import com.myfun.repository.admindb.po.AdminFunSectionExample;
import com.myfun.repository.support.mybatis.api.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Generated date 2020-11-18 18:53
*/
public interface AdminFunSectionMapper extends BaseMapper<AdminFunSection, AdminFunSection> {
    int countByExample(AdminFunSectionExample example);

    int deleteByExample(AdminFunSectionExample example);

    List<AdminFunSection> selectByExample(AdminFunSectionExample example);

    int updateByExampleSelective(@Param("record") AdminFunSection record, @Param("example") AdminFunSectionExample example);

    int updateByExample(@Param("record") AdminFunSection record, @Param("example") AdminFunSectionExample example);
}