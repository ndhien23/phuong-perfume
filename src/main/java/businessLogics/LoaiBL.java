package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.Loai;

public class LoaiBL {
	public static List<Loai> docTatCa() {
		String sql = "SELECT * FROM loai";
		List<Loai> ds = taoDanhSach(sql);
		return ds;
	}
	private static List<Loai> taoDanhSach(String sql) {
		List<Loai> ds = new ArrayList<Loai>();
		try(Connection ketNoi = CSDL.getKetNoi()) {
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Loai l = new Loai();
				l.setiD(rs.getInt("id"));
				l.setTenLoai(rs.getString("tenloai"));
				ds.add(l);
			}
			return ds;
		} catch (Exception e) {
			return null;
		}
	}
//	public static void main(String[] args) {
//		if(docTatCa() != null)
//			System.out.println("thanh cong");
//		else
//			System.out.println("that bai");
//	}
}
