package com.rmsystem.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rmsystem.bean.DeliveryBean;

public class DeliveryDaoImpl extends DatabaseDao {
	
	private static final String TABLE_NAME = "delivery_info";
	
	private static final String INSERT_SQL = "insert into " + DATABASE_NAME + "." + TABLE_NAME + 
			"(order_menu,address,phone,order_time,arrive_time) values(?,?,?,?,?)";
	
	private static final String SELECT_SQL = "select * from " + DATABASE_NAME + "." + TABLE_NAME;
	
	private PreparedStatement mPreparedStatement;
	
	private List<DeliveryBean> mList;
	
	public DeliveryDaoImpl() {
		super();
		mList = new ArrayList<DeliveryBean>();
	}
	
	public void add(DeliveryBean bean) {
		try {
			mPreparedStatement = getConnection().prepareStatement(INSERT_SQL);
			mPreparedStatement.setString(1, bean.getOrderMenu());
			mPreparedStatement.setString(2, bean.getAddress());
			mPreparedStatement.setString(3, bean.getPhone());
			mPreparedStatement.setString(4, bean.getOrderTime().toString());
			mPreparedStatement.setString(5, bean.getArriveTIme().toString());
			System.out.println(mPreparedStatement);
			int result = mPreparedStatement.executeUpdate();
			mPreparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete(Object arg) {
		
	}

	public void read() {
		
	}

	public void update(Object arg) {
		
	}
	
}
