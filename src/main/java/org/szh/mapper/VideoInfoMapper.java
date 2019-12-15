package org.szh.mapper;

import org.szh.beans.VideoInfo;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(String markId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(String markId);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}