package bai11;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
	protected double soTiet;
	   protected double donGia;
	public GVThinhGiang() {
		super();
		this.soTiet=0;
		this.donGia=0;
		
	}
	   
	@Override
	public double tinhLuong() {
		double thuNhap;
		thuNhap = 15/100 *(this.soTiet*this.donGia);
		return soTiet*donGia-thuNhap;
	}
	public void nhapTT() {
		System.out.println("Nhap thong tin - giang vien thinh giang : ");
		super.nhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don gia :");
		donGia = sc.nextDouble();
		System.out.println("Nhap so tiet day trong thang : ");
		soTiet = sc.nextDouble();
	}
	
}
