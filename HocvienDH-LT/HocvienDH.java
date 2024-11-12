package Bai10;

import java.util.Scanner;

public class HocvienDH extends Hocvien {
 protected int soBuoi;
 protected int donGia;
 protected int uT;
	



	


	public void nhapTT() {
		
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so buoi: ");
		this.soBuoi=input.nextInt();
		
		System.out.println("Nhap don gia: ");
		this.donGia= input.nextInt();
	}


	@Override
	public double hocPhi() {
		if(this.loaiuT ==1)
			this.uT=1000000;
		else if(this.loaiuT ==2)
			this.uT=500000;
		return this.soBuoi * this.donGia -this.uT;
	}





	public HocvienDH() {
		super();
	}

}
