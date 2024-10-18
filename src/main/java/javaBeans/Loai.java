package javaBeans;

import java.io.Serializable;

public class Loai implements Serializable{

	private static final long serialVersionUID = 1L;
	private int iD;
	private String tenLoai;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Loai() {
		super();
	}
	
	
}
