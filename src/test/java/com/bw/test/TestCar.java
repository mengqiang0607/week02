package com.bw.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.mq.bean.Car;
import com.mq.mapper.CarMapper;

public class TestCar {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		CarMapper mapper = app.getBean(CarMapper.class);
		
		List<Object[]> list = IOUtils.readFile("cms附件-机械设备公司年检信息.txt", "\t");
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
			if(!StringUtil.isNumber((objects[0]+""))){
				mapper.addError((objects[0]+""),1);
			}else if(!StringUtil.isEmpty((objects[2]+""))||!StringUtil.isEmpty((objects[3]+""))||!StringUtil.isEmpty((objects[4]+""))){
				mapper.addError((objects[0]+""),2);
			}else if(!StringUtil.isEmpty(objects[5]+"")&&!StringUtil.isNumber((objects[5]+""))){
				mapper.addError((objects[0]+""),3);
			}else if(!StringUtil.isEmpty(objects[7]+"")){
				mapper.addError((objects[0]+""),4);
			}else if(!StringUtil.isEmpty(objects[6]+"")){
				mapper.addError((objects[0]+""),5);
			}else{
				//Car car = new Car(Integer.parseInt(objects[0]+""),objects[1]+"",objects[2]+"",objects[3]+"",objects[4]+"",objects[5]+"",objects[6]+"",objects[7]+"",objects[8]+"",objects[9]+"");
				Car car = new Car();
				mapper.addCar(car);
			}	
				
			
		}

	}

}
