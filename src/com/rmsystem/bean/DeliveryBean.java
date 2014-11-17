package com.rmsystem.bean;

import java.sql.Timestamp;

public class DeliveryBean {
	
	private int mId;
	
	private String mOrderMenu;
	
	private String mAddress;
	
	private String mPhone;
	
	private Timestamp mOrderTime;
	
	private Timestamp mArriveTIme;
	
	public void DelivertBrean() {
		
	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		mId = id;
	}

	public String getOrderMenu() {
		return mOrderMenu;
	}

	public void setOrderMenu(String orderMenu) {
		mOrderMenu = orderMenu;
	}

	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String address) {
		mAddress = address;
	}

	public String getPhone() {
		return mPhone;
	}

	public void setPhone(String phone) {
		mPhone = phone;
	}

	public Timestamp getOrderTime() {
		return mOrderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		mOrderTime = orderTime;
	}

	public Timestamp getArriveTIme() {
		return mArriveTIme;
	}

	public void setArriveTIme(Timestamp arriveTIme) {
		mArriveTIme = arriveTIme;
	}
	
	
	
}
