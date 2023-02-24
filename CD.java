package tuan2TH;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;
	
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception {
		if (ma!="") {
			this.maCD = ma;
		} else throw new Exception("Loi ma");
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if (tua!="") {
			this.tuaCD = tua;
		} else throw new Exception("loi");
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngayPH) throws Exception {
		if (ngayPH!=null) {
			this.ngayPH = ngayPH;
		} else throw new Exception("loi ngay");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}
	public CD() {
		Calendar c1 = Calendar.getInstance();
		this.maCD = "00000000";
		this.tuaCD = "xxxxxxxx";
		this.ngayPH = c1;
		this.donGia = 10000;
		this.soBH = 0;
	}
	public CD(String ma, String tua, Calendar ngayPH, double donGia, int so) throws Exception {
		if (ma!="") {
			this.maCD = ma;
		} else throw new Exception("Loi ma");
		if (tua!="") {
			this.tuaCD = tua;
		} else throw new Exception("loi");
		if (ngayPH!=null) {
			this.ngayPH = ngayPH;
		} else throw new Exception("loi ngay");
		this.donGia = donGia;
		if (so>0) {
			this.soBH = so;
		} else throw new Exception("Loi so");
	}
	private double getThanhTien() {
		return getDonGia()*getSoBH();
	}
	public void tieuDe() {
		System.out.println("Test ket qua");
		System.out.println("-");
		System.out.println();
		System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|\n",
				"Ma CD", "Tua CD", "Ngay phat hanh", "Don gia", "So bai hat", "Tong tien");
		System.out.println("-");
		System.out.println();
	}
	Locale lc = new Locale("vi","VN");
	DateFormat df= DateFormat.getDateInstance(1, lc);
	NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|",getMaCD(), getTuaCD(), 
		df.format(getNgayPH().getTime()),sf.format(getDonGia()),
		getSoBH(), sf.format(getThanhTien()));
		return s;
	}
}
	