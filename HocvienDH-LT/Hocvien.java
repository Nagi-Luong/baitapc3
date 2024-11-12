package Bai10;

import java.util.Scanner;

public abstract class Hocvien {
 protected String hoTen;
 protected String diaChi;
 protected String loaiCT;
 protected int loaiuT;


public Hocvien() {
	
}
public Hocvien(String hoTen, String diaChi, String loaiCT, int uT) {
	super();
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.loaiCT = loaiCT;
	this.loaiuT = uT;
}
public void nhapTT() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("nhap ten : ");
	  hoTen = sc.nextLine();
	  System.out.println("nhap dia chi : ");
	  diaChi = sc.nextLine();
	  System.out.println("nhap loai chuong trinh : ");
	  loaiCT = sc.nextLine();
	  System.out.println("nhap loai uu tien : ");
	  loaiuT = sc.nextInt();
	  
  }
public abstract double hocPhi();
public void inTT() {
	System.out.println("Ho ten :"+hoTen);
	System.out.println("Dia chi :"+ diaChi);
	System.out.println("Loai uu tien :"+loaiuT);
	System.out.println("Loai chuong trinh dang ki hoc"+loaiCT);
	System.out.println("Hoc phi: "+ hocPhi());
}

}
