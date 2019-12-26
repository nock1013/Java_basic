package oop.chap07.poly;

public class L5 extends Car implements Temp{

	public L5() {
		
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(getOilSize()-distance/8);
	
	}
	
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
		
	}
	@Override
	public int getTempGage() {
		return 2*getDistance()/10;
	}
	
	
	
}
