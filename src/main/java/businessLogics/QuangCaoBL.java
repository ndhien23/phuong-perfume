package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.QuangCao;

public class QuangCaoBL {
	public static List<QuangCao> docTatCa() {
		List<QuangCao> ds = new ArrayList<QuangCao>();
		try(Connection ketNoi = CSDL.getKetNoi()) {
			String sql = "SELECT * FROM quangcao";
			Statement smt = ketNoi.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				QuangCao qc = new QuangCao();
				qc.setiD(rs.getInt("id"));
				qc.setHinhAnh(rs.getString("hinhanh"));
				qc.setThongDiep(rs.getString("thongdiep"));
				qc.setThongTinChiTiet(rs.getString("thongtinchitiet"));
				qc.setNgayDang(rs.getDate("ngaydang"));
				ds.add(qc);
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
