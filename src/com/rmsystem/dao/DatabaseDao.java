package com.rmsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.rmsystem.util.DatabaseHelpers;

public class DatabaseDao {
	
	private static DatabaseDao mDatabaseDao;
	
	private static Connection mConnection;
	
	private static Statement mStatement;
	
	public static final String DATABASE_NAME = "restaurant_online";
	
	static {
		try {
			Class.forName(DatabaseHelpers.DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	protected DatabaseDao() {
		openDatabase();
	}
	
	public Connection getConnection() {
		return mConnection;
	}
	
	public Statement getStatement() {
		return mStatement;
	}
	
	public static DatabaseDao getDaoImpl(){
		if(mDatabaseDao == null) {
			mDatabaseDao = new DatabaseDao();
		}
		return mDatabaseDao;
	}
	
	public static void openDatabase() {
		try {
			if(mConnection == null) {
				mConnection = DriverManager.getConnection(DatabaseHelpers.URL);
			}
			if(mStatement == null) {
				mStatement = mConnection.createStatement();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeDatabase() {
		try {
			if(mStatement != null) {
				mStatement.close();
			}
			if(mConnection != null) {
				mConnection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
