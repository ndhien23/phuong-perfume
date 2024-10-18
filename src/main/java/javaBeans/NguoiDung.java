package javaBeans;

import java.io.Serializable;

public class NguoiDung implements Serializable{
	private static final long serialVersionUID = 1L;
	private int iD;
	private String email;
	private String password;
	private String hoTen;
	private String diaChi;
	private String dTDD;
	private int iD_VaiTro;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getdTDD() {
		return dTDD;
	}
	public void setdTDD(String dTDD) {
		this.dTDD = dTDD;
	}
	public int getiD_VaiTro() {
		return iD_VaiTro;
	}
	public void setiD_VaiTro(int iD_VaiTro) {
		this.iD_VaiTro = iD_VaiTro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public NguoiDung() {
		super();
	}
	
}
