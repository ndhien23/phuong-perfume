package businessLogics;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javaBeans.SanPham;
import javaBeans.SanPhamMua;

public class GioHang {

	private Hashtable<Integer, Integer> dsh; // key: idsp, value: slm

	public GioHang() {
		dsh = new Hashtable<Integer, Integer>();
	}

	public void them(int idsp, int slm) {
		if (dsh.containsKey(idsp)) {
			dsh.replace(idsp, dsh.get(idsp) + slm);
		} else {
			dsh.put(idsp, slm);
		}
	}

	public int soMatHang() {
		return dsh.size();
	}

	public double tongTien() {
		double tt = 0;
		for (int id : dsh.keySet()) {
			SanPham sp = SanPhamBL.docTheoID(id);
			tt += sp.getDonGiaKM() * dsh.get(id);
		}
		return tt;
	}

	public List<SanPhamMua> danhSachSanPhamMua() {
		List<SanPhamMua> ds = new ArrayList<SanPhamMua>();
		for (int id : dsh.keySet()) {
			SanPham sp = SanPhamBL.docTheoID(id);
			SanPhamMua spm = new SanPhamMua();

			spm.setiD(sp.getiD());
			spm.setTenSanPham(sp.getTenSanPham());
			spm.setMoTa(sp.getMoTa());
			spm.setHinhAnh(sp.getHinhAnh());
			spm.setDonGia(sp.getDonGia());
			spm.setDonGiaKM(sp.getDonGiaKM());
			spm.setSoLuong(sp.getSoLuong());
			spm.setNgayTao(sp.getNgayTao());
			spm.setHienThi(sp.getHienThi());
			spm.setiD_Loai(sp.getiD_Loai());
			spm.setiD_ThuongHieu(sp.getiD_ThuongHieu());

			spm.setSoLuongMua(dsh.get(id));
			ds.add(spm);
		}
		return ds;
	}
	
//	public static void main(String[] args) {
//		GioHang gh = new GioHang();
//		gh.them(1, 1);
//		gh.them(2, 1);
//		gh.them(1, 1);
//		gh.dsh.forEach((k,v) -> System.out.println(k + " -> " + v));
//		System.out.println("Tong tien: " + gh.tongTien());
//		System.out.println("Tong tien: " + String.format("%.2f",gh.tongTien()));
//		System.out.println("So mat hang: " + gh.soMatHang());
//	}
}
