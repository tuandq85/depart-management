package com.practice.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.config.ConnectDatabase;

public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 4396265304984668571L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = ConnectDatabase.getConnection();
		if(conn != null) {
			String selectSQL = "SELECT * FROM NHAN_VIEN";
			String sql = selectSQL + " WHERE MA_NV = ?";
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, "nv04");

				ResultSet prs = ps.executeQuery();
				while(prs.next()) {
					String maNv = prs.getString("ma_nv");
					System.out.println("ma_nv :" + maNv);
					String hoTen = prs.getString("ho_ten");
					System.out.println("ho_ten :" + hoTen);
					String gioiTinh = prs.getString("gioi_tinh");
					System.out.println("gioi_tinh :" + gioiTinh);
					Date ngaySinh = prs.getDate("ngay_sinh");
					System.out.println("ngay_sinh :" + ngaySinh);
					String diaChi = prs.getString(5);
					System.out.println("dia_chi :" + diaChi);
					String soDienThoai = prs.getString(6);
					System.out.println("so_dien_thoai :" + soDienThoai);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				conn = null;
			}
		}
		
	    request.getRequestDispatcher("/users/list.jsp").forward(request, response);
	}
}
