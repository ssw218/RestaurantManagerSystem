package com.rmsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rmsystem.bean.BoyBean;

public class BoyDaoImpl extends DatabaseDao {
	
	private static final String TABLE_NAME = "boy_info";
	
	private static final String ID = "id";
	
	private static final String PHONE = "phone";
	
	private static final String INSERT_SQL = "insert into " + DATABASE_NAME + "." + TABLE_NAME + "(" + PHONE + ") values(?)";
	
	private static final String SELECT_SQL = "select * from " + DATABASE_NAME + "." + TABLE_NAME;
	
	private static BoyDaoImpl mBoyDaoImpl;
	
	private PreparedStatement mPreparedStatement;
	
	private ResultSet mResultSet;
	
	private List<BoyBean> mList;
	
	private BoyDaoImpl() {
		super();
		mList = new ArrayList<BoyBean>();
		read();
	}
	
	public static BoyDaoImpl getDaoImpl() {
		if(mBoyDaoImpl == null)
			mBoyDaoImpl = new BoyDaoImpl();
		return mBoyDaoImpl;
	}
	
	public List<BoyBean> getBoyList() {
		return  mList;
	}
	
	public void read() {
		try {
			mResultSet = getStatement().executeQuery(SELECT_SQL);
			while(mResultSet.next()) {
				BoyBean boyBean = new BoyBean();
				boyBean.setId(mResultSet.getInt(ID));
				boyBean.setPhone(mResultSet.getString(PHONE));
				mList.add(boyBean);
			}
			mResultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add(BoyBean boyBean) {
		try {
			mPreparedStatement = getConnection().prepareStatement(INSERT_SQL);
			mPreparedStatement.setString(1, boyBean.getPhone());
			int result = mPreparedStatement.executeUpdate();
			mPreparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
