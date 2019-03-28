package com.hovs.sfi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class BulkPasswordUpdator {

	
	public static void main(String[] args) {
		Connection con=null;
		ResultSet lResultSet = null;
		 try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://10.182.158.26:1433;databasename=SFIDB","sfi","sfi@sbr");
			String query = "Select USERID,LOGINNAME from Admin.TbmstUser";
			 Statement lStatement = con.createStatement();
		     lResultSet = lStatement.executeQuery(query);
		     
		     Map<String,String> lMap = new HashMap<String,String>();
		     while(lResultSet.next()){
		    	 lMap.put(lResultSet.getString("USERID"), lResultSet.getString("LOGINNAME"));
		     }
		    
		     for(Map.Entry<String, String> aMap : lMap.entrySet()){
		    	 
		    	 System.out.println("User Id : "+aMap.getKey()+" Login Name :"+aMap.getValue());
		     }
		     
		     
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
