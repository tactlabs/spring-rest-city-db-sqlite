package org.tact.base.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.tact.base.mybatis.domain.City;

@Mapper
public interface CityMapper {

	City findByState(@Param("state") String state);
	
	List<City> findMultipleCitiesByStates(@Param("state") String state);
}