package oop.chap07.poly;

public class Rectangle extends Shape implements Resize{
	public Rectangle(){	
		
	}
	public Rectangle(int wigth, int height,String colors) {
		super(wigth,height,colors);
		
	}
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}
	
	public double getArea() {
		/*double area = 0.0;
		 * area = (getWidth()*getheight());
		 * return area;
		 */
		return (double)(getHeight() * getWidth());
	}
}
