package javaBeans;

import java.io.Serializable;
import java.sql.Date;

public class SanPham implements Serializable{

	private static final long serialVersionUID = 1L;
	private int iD;
	private String tenSanPham;
	private String moTa;
	private String hinhAnh;
	private double donGia;
	private double donGiaKM;
	private int soLuong;
	private Date ngayTao;
	private int hienThi;
	private int iD_Loai;
	private int iD_ThuongHieu;
	
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDonGiaKM() {
		return donGiaKM;
	}
	public void setDonGiaKM(double donGiaKM) {
		this.donGiaKM = donGiaKM;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public int getHienThi() {
		return hienThi;
	}
	public void setHienThi(int hienThi) {
		this.hienThi = hienThi;
	}
	public int getiD_Loai() {
		return iD_Loai;
	}
	public void setiD_Loai(int iD_Loai) {
		this.iD_Loai = iD_Loai;
	}
	public int getiD_ThuongHieu() {
		return iD_ThuongHieu;
	}
	public void setiD_ThuongHieu(int iD_ThuongHieu) {
		this.iD_ThuongHieu = iD_ThuongHieu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SanPham() {
		super();
	}
	
}
