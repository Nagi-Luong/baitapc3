package bai11;

import java.util.Scanner;

public abstract class GiangVien {
 protected String hoTen;
 protected String diaChi;
 protected String loaiGV;
 public void nhapTT() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("nhap ten : ");
	 hoTen = sc.nextLine();
	 System.out.println("nhap dia chi : ");
	 diaChi = sc.nextLine();
	 System.out.println("nhap loai giao vien ");
	 loaiGV = sc.nextLine();
	 
 }
public GiangVien() {
	this.hoTen =" ";
	this.diaChi=" ";
	this.loaiGV=" ";
	
}
 public abstract double tinhLuong();
 public void inTT() {
	 System.out.println("Ten: "+ this.hoTen);
	 System.out.println("Dia Chi : "+ this.diaChi);
	 System.out.println("Loai Giang Vien : "+ this.loaiGV);
	 System.out.println( "Luong Thang :"+tinhLuong());
 }
 
}
