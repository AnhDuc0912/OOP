package tuan4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	public String maHang;
	public String tenHang;
	public int donGia;
	LocalDate ngay = LocalDate.of(2023, 03, 10);
	private LocalDate ngaysanxuat;
	private LocalDate ngayHetHang;
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception{
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else throw new Exception("Loi: ma hang rong!");
	}
	
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public LocalDate getNgay() {
		return ngay;
	}
	public void setNgay(LocalDate ngay) {
		this.ngay = ngay;
	}
	public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaysanxuat, LocalDate ngayHetHang) throws Exception{
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else throw new Exception("Loi: ma hang rong!");
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaysanxuat = ngaysanxuat;
		this.ngayHetHang = ngayHetHang;
	}
	public boolean hetHan() {
		return this.ngayHetHang.isBefore(LocalDate.now()) ? false : true;
	}
	
	@Override
	public String toString() {
		String kq = " ";
		if (hetHan() == true) {
			kq = "Het Han";
		}
		DateTimeFormatter datef = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s%-15s%-20d%-20s%-20s%-10s", maHang, tenHang, this.donGia,
				datef.format(ngaysanxuat),datef.format(ngayHetHang), kq);
	}

	public static void main(String[] args) throws Exception {
		
		HangThucPham hang = new HangThucPham("001", "Gao", 100000, LocalDate.of(2020, 10, 20), LocalDate.of(2023, 3, 11));
		System.out.println(hang);
	}
}
