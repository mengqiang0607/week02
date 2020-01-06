package com.mq.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Car {
	private Integer id;
	private String ms;
	private String name;
	private String cp;
	private String adds;
	private String price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date btime;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date etime;
	private String zt;
	private String bz;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer id, String ms, String name, String cp, String adds, String price, Date btime, Date etime,
			String zt, String bz) {
		super();
		this.id = id;
		this.ms = ms;
		this.name = name;
		this.cp = cp;
		this.adds = adds;
		this.price = price;
		this.btime = btime;
		this.etime = etime;
		this.zt = zt;
		this.bz = bz;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getAdds() {
		return adds;
	}
	public void setAdds(String adds) {
		this.adds = adds;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getBtime() {
		return btime;
	}
	public void setBtime(Date btime) {
		this.btime = btime;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", ms=" + ms + ", name=" + name + ", cp=" + cp + ", adds=" + adds + ", price=" + price
				+ ", btime=" + btime + ", etime=" + etime + ", zt=" + zt + ", bz=" + bz + "]";
	}
	
	
	

}
