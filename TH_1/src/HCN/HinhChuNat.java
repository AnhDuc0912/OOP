package HCN;

public class HinhChuNat {
	public int cd;
	public int cr;
	
	
	public HinhChuNat() {
		// TODO Auto-generated constructor stub
	}
	public HinhChuNat(int cd, int cr) {
		this.cd = cd;
		this.cr = cr;
	}
	public int getCd() {
		return this.cd;
	}
	public void setCd(int cd) throws Exception {
		if(cd>0) {
			this.cd = cd;
		}
		else throw new Exception("Chieu dai khong hop le!");
	}
	public int getCr() {
		return this.cr;
	}
	public void setCr(int cr) throws Exception{
		if(cr>0) {
			this.cr = cr;
		}
		else throw new Exception("Chieu rong khong hop le!");
			
	}
	
	public int ChuVi() {
		return (this.cd + this.cr) * 2;
	}
	public int DienTich() {
		return this.cd * this.cr;
	}
	
	public static void main(String[] args) throws Exception {
		HinhChuNat hcn = new HinhChuNat(4, 2);
		
		hcn.setCd(4);
		hcn.setCr(2);
		
		System.out.println("Chu Vi: " + hcn.ChuVi());
		System.out.println("Diện Tích: " + hcn.DienTich());
		
	}
}
