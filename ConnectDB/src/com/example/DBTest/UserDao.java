
package com.example.DBTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;

public class UserDao {
	
	private static Connection conn = MyDB.getConn();
	
	public boolean InsertUser(User user) {
		ResultSet re=null;
		List<User> users=new ArrayList<User>();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into user value(null,?,?,?,?)");
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getPassword());
			
			int i=ps.executeUpdate();
			if(i==1) {
				System.out.println("插入成功！");
				return true;
			}else {
				System.out.println("插入失败！");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public List<User> GetUsers() {
		ResultSet re=null;
		List<User> users=new ArrayList<User>();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from user");
			re=ps.executeQuery();
			while(re.next()) {
				User user=new User();
				user.setId(re.getInt("id"));
				user.setName(re.getString("name"));
				user.setEmail(re.getString("email"));
				user.setPhone(re.getString("phone"));
				user.setPassword(re.getString("password"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	
	public boolean updataUser(User user) {
		try {
			PreparedStatement ps = conn.prepareStatement("update user set name=?,email=?,phone=?,password=? where id =?");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getPassword());
			ps.setInt(5, user.getId());
			if(ps.executeUpdate()==1) {
				System.out.println("修改成功");
				return true;
			}else {
				System.out.println("修改失败");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}
	public boolean deleteUser(int id) {
		try {
			PreparedStatement ps = conn.prepareStatement("delete from user where id =?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(1==i) {
				System.out.println("删除成功");
				return true;
			}else {
				System.out.println("删除失败");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public User selectUser(int id) {
		User user=new User();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from user where id =?");
			ps.setInt(1, id);
			ResultSet re = ps.executeQuery();
			while(re.next()) {
				user.setId(re.getInt("id"));
				user.setName(re.getString("name"));
				user.setEmail(re.getString("email"));
				user.setPhone(re.getString("phone"));
				user.setPassword(re.getString("password"));
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
