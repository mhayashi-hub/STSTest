package com.jin.edu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jin.edu.dto.BushoInfoDto;

@Mapper
public interface BushoInfoDaoMapper {
	public BushoInfoDto select(String bushoCd);
}
