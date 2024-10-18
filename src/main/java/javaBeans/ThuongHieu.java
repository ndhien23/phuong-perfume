package javaBeans;

import java.io.Serializable;

public class ThuongHieu implements Serializable{
	private static final long serialVersionUID = 1L;
	private int iD;
	private String tenThuongHieu;
	private String hinhAnh;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getTenThuongHieu() {
		return tenThuongHieu;
	}
	public void setTenThuongHieu(String tenThuongHieu) {
		this.tenThuongHieu = tenThuongHieu;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ThuongHieu() {
		super();
	}
	
}
