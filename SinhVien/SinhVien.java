package bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	protected String lop;
	protected String nganh;
	protected Truong truong;
	public SinhVien() {
		 
	}
	
	
	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}


	public String getLop() {
		return lop;
	}
	public String getNganh() {
		return nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien:");
		super.nhapTT();	
		System.out.println("Lop: ");
		this.lop=input.next();		
		System.out.println("Nganh: ");
		this.nganh=input.next();}
	@Override
	public String toString() {
		return super.toString()+"SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
}
