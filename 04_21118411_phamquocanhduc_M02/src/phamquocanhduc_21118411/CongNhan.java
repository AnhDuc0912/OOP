package phamquocanhduc_21118411;

public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private double mSoSP;
	
	//đóng gói
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public double getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(double mSoSP) {
		this.mSoSP = mSoSP;
	}
	//constructor
	public CongNhan(int maCN, String mHo, String mTen, double mSoSP) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	public CongNhan() {
	}
	//method
	public double tinhDonGia() {
		if(this.mSoSP > 1 && this.mSoSP < 199) {
			return 0.5;
		}else if(this.mSoSP >= 200 && this.mSoSP <= 399) {
			return 0.55;
		}else if(this.mSoSP >= 400 && this.mSoSP <= 599) {
			return 0.6;
		}else if(this.mSoSP >  600) {
			return 0.65;
		}
		
		return 0;
	}
	public double tinhLuong() {
		return this.tinhDonGia() * this.getmSoSP();
	}
	@Override
	public String toString() {
		return this.maCN + ", " + this.mHo + " " + this.mTen + ", " + this.tinhLuong();
	}
	public static void main(String[] args) {
		CongNhan cn = new CongNhan(1, "Nguyen", "Hang", 200);
		
		System.out.println(cn.toString());
	}
	
}
