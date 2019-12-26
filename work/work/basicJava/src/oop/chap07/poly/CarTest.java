package oop.chap07.poly;

import java.awt.event.TextEvent;

public class CarTest {

	public static void main(String[] args) {
		Car[] car = new Car[2];
		
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
		System.out.println("vehicleName"+" \t "+"engineSize"+" \t "+"oilTank"+"\t"+"oilSize"+" \t "+"distance"+" \t "+"temperature"+"\n"
							+"--------------------------------------------------------------");
		for(int i=0; i<car.length;i++) {
			System.out.println(car[i].getName()+" \t "+car[i].getEngine()+"\t"+car[i].getOilTank()+" \t" +car[i].getOilSize()+" \t "
								+car[i].getDistance()+"\t"+((Temp)car[i]).getTempGage());
		}
		System.out.println("25 주유");
		System.out.println("vehicleName"+" \t "+"engineSize"+" \t "+"oilTank"+"\t"+"oilSize"+" \t "+"distance"+" \t "+"temperature"+"\n"
				+"--------------------------------------------------------------");
		for(int i=0; i<car.length;i++) {
			car[i].setOil(25);
			System.out.println(car[i].getName()+" \t "+car[i].getEngine()+"\t"+car[i].getOilTank()+" \t "+car[i].getOilSize()+" \t "
					+car[i].getDistance()+"\t"+((Temp)car[i]).getTempGage());
		}
		System.out.println("80 주행");
		System.out.println("vehicleName"+" \t "+"engineSize"+" \t "+"oilTank"+"\t"+"oilSize"+" \t "+"distance"+" \t "+"temperature"+"\n"
				+"--------------------------------------------------------------");
		for(int i=0; i<car.length;i++) {
			car[i].go(80);
			System.out.println(car[i].getName()+" \t "+car[i].getEngine()+"\t"+car[i].getOilTank()+" \t "+car[i].getOilSize()+" \t "
					+car[i].getDistance()+"\t"+((Temp)car[i]).getTempGage());
		
		}
	}

}
