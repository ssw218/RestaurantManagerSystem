package com.rmsystem.test;

import java.sql.Timestamp;

import com.rmsystem.bean.DeliveryBean;
import com.rmsystem.dao.DatabaseDao;
import com.rmsystem.dao.DeliveryDaoImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryDaoImpl deliveryDaoImpl = DeliveryDaoImpl.getDaoImpl();
		DeliveryBean deliveryBean = new DeliveryBean();
		deliveryBean.setOrderMenu("none");
		deliveryBean.setAddress("天津师范大学西青区");
		deliveryBean.setPhone("123");
		deliveryBean.setOrderTime(new Timestamp(System.currentTimeMillis() - 100000));
		deliveryBean.setArriveTIme(new Timestamp(System.currentTimeMillis()));
		deliveryDaoImpl.add(deliveryBean);
		DeliveryDaoImpl.closeDatabase();
	}

}
