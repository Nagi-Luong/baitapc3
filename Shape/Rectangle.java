package Bai8;

import java.util.Scanner;

public class Rectangle extends Shape {
 private int length;
 private int width;
 
	@Override
	public double getArea() {
		
		return length*width;
	}

	@Override
	public String toString() {
		return super.toString()+ "Rectangle [length=" + length + ", width=" + width + "]";
	}

public void nhapTT() {
		
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		
		System.out.println("Nhập chiều dài: ");
		this.length= input.nextInt();
		
		System.out.println("Nhập chiều rộng: ");
		this.width=input.nextInt();
	}
	

}
