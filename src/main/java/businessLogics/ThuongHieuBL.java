package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.ThuongHieu;

public class ThuongHieuBL {
	public static List<ThuongHieu> docTatCa() {
		List<ThuongHieu> ds = new ArrayList<ThuongHieu>();
		try(Connection ketNoi = CSDL.getKetNoi()) {
			String sql = "SELECT * FROM thuonghieu";
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				ThuongHieu th = new ThuongHieu();
				th.setiD(rs.getInt("id"));
				th.setTenThuongHieu(rs.getString("tenthuonghieu"));
				th.setHinhAnh(rs.getString("hinhanh"));
				ds.add(th);
			}
			return ds;
		} catch (Exception e) {
			return null;
		}
	}
//	public static void main(String[] args) {
//		docTatCa().forEach(x->System.out.println(x.getiD() + " - " + x.getTenThuongHieu() + " - " + x.getHinhAnh()));
//	}
}
