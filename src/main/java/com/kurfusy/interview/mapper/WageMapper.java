package com.kurfusy.interview.mapper;

import com.kurfusy.interview.pojo.Wage;

public interface WageMapper {
    int deleteByPrimaryKey(String salaryId);

    int insert(Wage record);

    int insertSelective(Wage record);

    Wage selectByPrimaryKey(String salaryId);

    int updateByPrimaryKeySelective(Wage record);

    int updateByPrimaryKey(Wage record);
}