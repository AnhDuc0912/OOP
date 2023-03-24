package phamquocanhduc_21118411;

import java.util.ArrayList;
import java.util.Iterator;

public class DanhSachCongNhan{
	private CongNhan[] dsCongNhan;
	private int soLuong;
	//đóng gói
	public CongNhan[] getDsCongNhan() {
		return dsCongNhan;
	}
	public void setDsCongNhan(CongNhan[] dsCongNhan) {
		this.dsCongNhan = dsCongNhan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	//constructor
	public DanhSachCongNhan(int soLuong) {
		this.dsCongNhan = new CongNhan[soLuong];
		this.soLuong = soLuong;
	}
	//method
	public int nhapSoLuongCongNhan(int n) throws Exception{
		if(n >= 0) {
			return this.soLuong = n;
		}else
			throw new Exception("Số lượng là số nguyên dương");
	}
	public boolean kiemTraSoLuong() {
		int count = 0;
		for(int i = 0; i < this.dsCongNhan.length; i++) {
			if(this.dsCongNhan[i] != null) {
				count++;
			}
		}
		return count < this.soLuong ? true : false;
	}
	public void themCongNhan(CongNhan cn) throws Exception {
		int lenDs = this.dsCongNhan.length;
		if(this.kiemTraSoLuong() == true) {
			for(int i = 0; i < lenDs; i++) {
				if(this.dsCongNhan[i] == null) {
					this.dsCongNhan[i] = cn;
					break;					
				} 
			}
		}else 
			throw new Exception("Độ lớn của ds không cho phép");
	}
	public int tinhSoLuong() {
		int count = 0;
		for(int i = 0; i < this.dsCongNhan.length; i++) {
			if(this.dsCongNhan[i] != null) {
				count++;
			}
		}
		return count;
	}
	public void hienThiDanhSach() {
		System.out.println("Danh sách công nhân");
		for(int i = 0; i < this.dsCongNhan.length; i++) {
			System.out.println(this.dsCongNhan[i]);
		}
	}
	public void xuatThongTinCongNhanTren200SP() {
		System.out.println("Danh sách công nhân làm trên 200SP");
		for(int i = 0; i < this.dsCongNhan.length; i++){
			if(this.dsCongNhan[i] == null){
				i--;
				break;
			}
			if(this.dsCongNhan[i].getmSoSP() >= 200){
				System.out.println(this.dsCongNhan[i]);
			}
		}
	}
	/**
	 * 
	 */
	public void sapXepTheoSp() {
		System.out.println("Danh sách sau khi đã sắp xếp");
		for(int i = 0; i < this.dsCongNhan.length - 1; i++){
			for(int j = i + 1; j < this.dsCongNhan.length; j++){
				if(this.dsCongNhan[j] == null){
					j--;
					break;
				}
				if(this.dsCongNhan[i].getmSoSP() < this.dsCongNhan[j].getmSoSP()){
					double a = this.dsCongNhan[i].getmSoSP();
					double b = this.dsCongNhan[j].getmSoSP();
					double temp = a;
					a = b;
					b = temp;
				}
			}
			System.out.println(this.dsCongNhan[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		DanhSachCongNhan dsCN = new DanhSachCongNhan(10);
		
		CongNhan cn1 = new CongNhan(1, "Nguyen", "Hang", 200);
		CongNhan cn2 = new CongNhan(2, "Pham", "Tuan", 200);
		CongNhan cn3 = new CongNhan(3, "Pham", "Duc", 159);
		
//		System.out.println(cn1);
//		System.out.println(cn2);
//		System.out.println(cn3);
		dsCN.themCongNhan(cn1);
		dsCN.themCongNhan(cn2);
		dsCN.themCongNhan(cn3);

		dsCN.hienThiDanhSach();
		System.out.println("Số lượng công nhân trong danh sách là: " + dsCN.tinhSoLuong());
		dsCN.xuatThongTinCongNhanTren200SP();
		dsCN.sapXepTheoSp();
	}
}
