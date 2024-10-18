package javaBeans;

import java.io.Serializable;

public class SanPhamMua extends SanPham implements Serializable {

	private static final long serialVersionUID = 1L;
	private int soLuongMua;

	public int getSoLuongMua() {
		return soLuongMua;
	}

	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SanPhamMua() {
		super();
	}
	
	public double thanhTien() {
		return this.getDonGiaKM() * soLuongMua;
	}
}
