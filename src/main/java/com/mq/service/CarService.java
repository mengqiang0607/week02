package com.mq.service;

import java.util.List;
import java.util.Map;

import com.mq.bean.Car;

public interface CarService {

	public List<Car> selectAll(Map<String, Object> map);

	public Car selectOne(int id);
	
	public int updateCar(Car car);

}
