package oop.chap07.poly;

public class Triangle extends Shape implements Resize {
	public Triangle() {
	}
	public Triangle(int widht, int height, String colors) {
		super(widht,height,colors);
	}
	
	public void setResize(int size) {	
		setHeight(getHeight()+size);
	}
	
	public double getArea() {
		return (double)getWidth()*getHeight()/2;
	}	
}
