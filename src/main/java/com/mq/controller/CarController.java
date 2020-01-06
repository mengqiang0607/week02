package com.mq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mq.bean.Car;
import com.mq.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService cs;
	
	@RequestMapping("list")
	public String selectAll(@RequestParam(defaultValue="1")int pageNum,Model m,String name,String btime,String etime,String price){
		
		PageHelper.startPage(pageNum, 2);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", name);
		map.put("btime", btime);
		map.put("etime", etime);
		map.put("price", price);
		List<Car> list = cs.selectAll(map);
		PageInfo<Car> plist = new PageInfo<Car>(list);
		m.addAttribute("plist", plist);
		m.addAttribute("map", map);
		return "list";
		
	}
	
	@RequestMapping("show")
	public String showCar(int id,Model m){
		Car car = cs.selectOne(id);
		m.addAttribute("car", car);
		return "update";
	}
	
	@RequestMapping("update")
	public String updateCar(Car car){
		int i = cs.updateCar(car);
		if(i>0){
			return "redirect:list";
		}
		return "update";
		
	}

}
