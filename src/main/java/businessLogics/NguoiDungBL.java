package businessLogics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javaBeans.NguoiDung;

public class NguoiDungBL {
	public static NguoiDung docTheoEmailPassword(String email, String password) {
		String sql = "SELECT * FROM nguoidung WHERE email = ? and password = ?";
		try(Connection ketNoi = CSDL.getKetNoi()) {
			PreparedStatement ps = ketNoi.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			NguoiDung nd = null;
			while(rs.next()) {
				nd = new NguoiDung();
				nd.setiD(rs.getInt("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassword(rs.getString("password"));
				nd.setHoTen(rs.getString("hoten"));
				nd.setDiaChi(rs.getString("diachi"));
				nd.setdTDD(rs.getString("dtdd"));
				nd.setiD_VaiTro(rs.getInt("id_vaitro"));
			}
			return nd;
		} catch (Exception e) {
			return null;
		}
	}
//	public static void main(String[] args) {
//		NguoiDung nd = docTheoEmailPassword("bichle@gmail.com", "bichle");
//		if(nd != null)
//			System.out.println(nd.getHoTen());
//		else
//			System.out.println("that bai");
//	}
}
