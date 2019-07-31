package com.example.DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnect {
	private static Connection con=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConnect my=new MyConnect();
		try {
			my.doTest();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean doTest() throws SQLException {
		String user="root";
		String pwd="120110";
		String url="jdbc:mysql://127.0.0.1:3306/menagrie?serverTimezone=GMT%2B8";
		Connection con=getConn(url,user,pwd);
		Statement state=null;
		state = con.createStatement();
		String sql="select * from pet";
		ResultSet rs=state.executeQuery(sql);
		System.out.println("查询宠物表结果");
		System.out.println("宠物名\t主人\t品种\t性别\t生日\t忌日");
		while(rs.next()) {
			System.out.println(rs.getString("name")+"\t"+rs.getString("owner")+rs.getString("species")
			+"\t"+rs.getString("sex")+"\t"+rs.getDate("birth")+"\t"+rs.getDate("death"));
		}
		return true;
	}
	public static Connection getConn(String url,String user,String pwd) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if(!con.isClosed()) {
				System.out.println("数据库连接成功！");
				return con;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
