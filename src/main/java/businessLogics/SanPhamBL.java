package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.SanPham;

public class SanPhamBL {
	public static List<SanPham> docTatCa() {
		String sql = "SELECT * FROM sanpham";
		List<SanPham> ds = taoDanhSach(sql);
		return ds;
	}

	public static SanPham docTheoID(int idsp) {
		String sql = "SELECT * FROM sanpham WHERE id = " + idsp;
		List<SanPham> ds = taoDanhSach(sql);
		if (ds.size() > 0)
			return ds.get(0);
		else
			return null;
	}

	public static List<SanPham> docSanPhamMoi(int top) {
		String sql = "SELECT *\r\n" + "FROM sanpham\r\n" + "ORDER BY ngaytao DESC LIMIT 0, " + top;
		List<SanPham> ds = taoDanhSach(sql);
		return ds;
	}

	public static List<SanPham> banChayNhieuNhat(int top) {
		String sql = "SELECT sp.*, COUNT(ct.soluong) AS soLuong\r\n"
				+ "FROM sanpham AS sp JOIN chitietdonhang AS ct\r\n" + "ON sp.id = ct.id_sanpham\r\n"
				+ "GROUP BY ct.id_sanpham\r\n" + "ORDER BY soLuong DESC LIMIT 0, " + top;
		List<SanPham> ds = taoDanhSach(sql);
		return ds;
	}

	public static List<SanPham> giamGiaNhieuNhat(int top) {
		String sql = "SELECT sp.*, (sp.dongia - sp.dongiaKM) AS giamGia\r\n" + "FROM sanpham AS sp\r\n"
				+ "ORDER BY giamGia DESC LIMIT 0, " + top;
		List<SanPham> ds = taoDanhSach(sql);
		return ds;
	}

	public static int tongSoTrang(int soDongTrang) {
		String sql = "SELECT * FROM sanpham";
		List<SanPham> ds = taoDanhSach(sql);
		return (ds.size() / soDongTrang) + (ds.size() % soDongTrang != 0 ? 1 : 0);
	}

	public static List<SanPham> viTriTrang(int trang, int soDongTrang) {
		int vt = (trang - 1) * soDongTrang;
		String sql = "SELECT * FROM sanpham LIMIT " + vt + "," + soDongTrang;
		List<SanPham> ds = taoDanhSach(sql);
		return ds;
	}

	private static List<SanPham> taoDanhSach(String sql) {
		List<SanPham> dssp = null;
		try (Connection ketNoi = CSDL.getKetNoi()) {
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			dssp = new ArrayList<SanPham>();
			while (rs.next()) {
				SanPham sp = new SanPham();
				sp.setiD(rs.getInt("id"));
				sp.setTenSanPham(rs.getString("tensanpham"));
				sp.setMoTa(rs.getString("mota"));
				sp.setHinhAnh(rs.getString("hinhanh"));
				sp.setDonGia(rs.getDouble("dongia"));
				sp.setDonGiaKM(rs.getDouble("dongiaKM"));
				sp.setSoLuong(rs.getInt("soluong"));
				sp.setNgayTao(rs.getDate("ngaytao"));
				sp.setHienThi(rs.getInt("hienthi"));
				sp.setiD_Loai(rs.getInt("id_loai"));
				sp.setiD_ThuongHieu(rs.getInt("id_thuonghieu"));
				dssp.add(sp);
			}
			return dssp;
		} catch (Exception e) {
			return null;
		}
	}
}
