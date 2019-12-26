package workbook;

public class MobileTest {

	public static void main(String[] args) {
		Ltab lTab = new Ltab("Ltab",500,"AP-01");
		Otab OTab = new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile\tBattery\tOS"); 
		System.out.println("----------------------------------");
		lTab.display();
		OTab.display();
		
		System.out.println("10분 충전");
		lTab.charge(10);
		OTab.charge(10);
		System.out.println("Mobile\tBattery\tOS"); 
		System.out.println("----------------------------------");
		lTab.display();
		OTab.display();
		
		System.out.println("5분 통화");
		lTab.operate(5);
		OTab.operate(5);
		System.out.println("Mobile\tBattery\tOS"); 
		System.out.println("----------------------------------");
		lTab.display();
		OTab.display();
		
	}

}
