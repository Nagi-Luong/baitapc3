package bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
   protected double LCB;
   protected double HSL;
   protected int thamNienCT;
   
	

	public GVCoHuu() {
	super();
	this.LCB =0;
	this.HSL=0;
	this.thamNienCT=0;
}
	public void nhapThongTin() {
		System.out.println("Nhap thong tin - giang vien co huu : ");
		super.nhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong co ban :");
		LCB = sc.nextDouble();
		System.out.println("Nhap he so luong : ");
		HSL = sc.nextDouble();
		System.out.println("Nhap so nam cong tac : ");
		thamNienCT = sc.nextInt();
	}


	@Override
	public double tinhLuong() {
		double phuCap;
		if(this.thamNienCT < 5) {
			phuCap = 0;
		}
		else {
			phuCap = (this.thamNienCT /100)*LCB;
		
		}
			
		return LCB*HSL+phuCap;
		
	}
	

}

