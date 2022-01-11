package com.jin.edu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jin.edu.dto.MergeInfoDto;

@Mapper
public interface MergeInfoDaoMapper {
	public MergeInfoDto select(String shainNo);
}
