package com.mq.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mq.bean.Car;
import com.mq.mapper.CarMapper;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarMapper cp;

	public List<Car> selectAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cp.selectAll(map);
	}

	public Car selectOne(int id) {
		// TODO Auto-generated method stub
		return cp.selectOne(id);
	}

	public int updateCar(Car car) {
		// TODO Auto-generated method stub
		return cp.updateCar(car);
	}

}
