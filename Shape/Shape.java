package Bai8;

import java.util.Scanner;

public abstract class Shape {
private String color;
public abstract double getArea();
@Override
public String toString() {
	return "Shape [color=" + color + "]";
}
public void nhapTT() {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập màu: ");
	this.color=input.next();
}
}
