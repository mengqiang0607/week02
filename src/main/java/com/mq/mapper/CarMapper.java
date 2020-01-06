package com.mq.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mq.bean.Car;

public interface CarMapper {

	void addError(@Param("eid")String j, @Param("ename")int i);

	void addCar(Car car);
	
	public List<Car> selectAll(Map<String,Object> map);
	
	public Car selectOne(int id);
	
	public int updateCar(Car car);

}
