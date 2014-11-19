package com.rmsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rmsystem.bean.DeliveryBean;

public class DeliveryDaoImpl extends DatabaseDao {
	
	private static final String TABLE_NAME = "delivery_info";
	
	private static final String ID = "id";
	
	private static final String ORDER_MENU = "order_menu";
	
	private static final String ADDRESS = "address";
	
	private static final String PHONE = "phone";
	
	private static final String ORDER_TIME = "order_time";
	
	private static final String ARRIVE_TIME = "arrive_time";
	
	private static final String INSERT_SQL = "insert into " + DATABASE_NAME + "." + TABLE_NAME + 
			"(" + ORDER_MENU + "," + ADDRESS + "," + PHONE + "," + ORDER_TIME + "," + ARRIVE_TIME + ") values(?,?,?,?,?)";
	
	private static final String SELECT_SQL = "select * from " + DATABASE_NAME + "." + TABLE_NAME;
	
	private static DeliveryDaoImpl mDeliveryDaoImpl;
	
	private PreparedStatement mPreparedStatement;
	
	private ResultSet mResultSet;
	
	private List<DeliveryBean> mList;
	
	private DeliveryDaoImpl() {
		super();
		mList = new ArrayList<DeliveryBean>();
		read();
	}
	
	public static DeliveryDaoImpl getDaoImpl() {
		if(mDeliveryDaoImpl == null) {
			mDeliveryDaoImpl = new DeliveryDaoImpl();
		}
		return mDeliveryDaoImpl;
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
		try {
			mResultSet = getStatement().executeQuery(SELECT_SQL);
			while(mResultSet.next()) {
				DeliveryBean deliveryBean = new DeliveryBean();
				deliveryBean.setId(mResultSet.getInt(ID));
				deliveryBean.setOrderMenu(mResultSet.getString(ORDER_MENU));
				deliveryBean.setAddress(mResultSet.getString(ADDRESS));
				deliveryBean.setPhone(mResultSet.getString(PHONE));
				deliveryBean.setOrderTime(mResultSet.getTimestamp(ORDER_TIME));
				deliveryBean.setArriveTIme(mResultSet.getTimestamp(ARRIVE_TIME));
			}
			mResultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Object arg) {
		
	}
	
	public List<DeliveryBean> getDeliveryList() {
		return mList;
	}
	
}
