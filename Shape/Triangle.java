package Bai8;

import java.util.Scanner;

public class Triangle extends Shape {
private int base;
private int height;

	@Override
	public double getArea() {
		
		return 0.5*base*height;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + "]";
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhập chiều cao: ");
		this.height=input.nextInt();
		
		System.out.println("Nhập cạnh đáy: ");
		this.base=input.nextInt();

}
}
