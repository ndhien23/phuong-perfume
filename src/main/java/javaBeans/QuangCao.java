package javaBeans;

import java.io.Serializable;
import java.sql.Date;

public class QuangCao implements Serializable{

	private static final long serialVersionUID = 1L;
	private	int iD;
	private String hinhAnh;
	private String thongDiep;
	private String thongTinChiTiet;
	private Date ngayDang;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getThongDiep() {
		return thongDiep;
	}
	public void setThongDiep(String thongDiep) {
		this.thongDiep = thongDiep;
	}
	public String getThongTinChiTiet() {
		return thongTinChiTiet;
	}
	public void setThongTinChiTiet(String thongTinChiTiet) {
		this.thongTinChiTiet = thongTinChiTiet;
	}
	public Date getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public QuangCao() {
		super();
	}
}
