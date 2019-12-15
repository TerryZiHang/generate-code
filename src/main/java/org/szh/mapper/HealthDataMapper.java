package org.szh.mapper;

import org.szh.beans.HealthData;

public interface HealthDataMapper {
    int deleteByPrimaryKey(String markId);

    int insert(HealthData record);

    int insertSelective(HealthData record);

    HealthData selectByPrimaryKey(String markId);

    int updateByPrimaryKeySelective(HealthData record);

    int updateByPrimaryKey(HealthData record);
}