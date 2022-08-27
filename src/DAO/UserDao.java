package DAO;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.apache.catalina.User;
import org.eclipse.jdt.internal.compiler.ast.SuperReference;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.sun.javafx.scene.layout.region.Margins.Converter;

import Connect.ConnectDB;

public class UserDao {

	ConnectDB connectDB=new ConnectDB();
	Connection connection=connectDB.getConnection();
	public void insertUser(int id){
		String sql = "insert into User(id) value(?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("THÊM THÀNH CÔNG!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void update(int id){
		String sql = "UPDATE user"+"SET username = ?"+"Password = ?"+"Where id =?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "user");
			preparedStatement.setString(2, "email");
			preparedStatement.setString(3, "password");
			preparedStatement.setInt(4,id);
			preparedStatement.executeUpdate();
			System.out.println("Capnhat THÀNH CÔNG!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(int id){
		String sql = "DELETE from user where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			preparedStatement.executeUpdate();
			System.out.println("Xoa THÀNH CÔNG!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void showUser(int id){
		String sql = "Select * from User where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet prs =preparedStatement.executeQuery();
			while (prs.next()) {
				String username=prs.getString("username");
				String email=prs.getString("email");
				String password=prs.getString("password");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public ArrayList<User> AllUser(){
		ArrayList<User> userList = new ArrayList<User>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet=null;
		String sql = "SELECT * FROM User_Data";
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
			ResultSet prs =preparedStatement1.executeQuery();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			if(resultSet!= null) {
				try {
					resultSet.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return userList;
}
}

	
