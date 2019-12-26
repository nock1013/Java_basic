package workbook;

public class Test05 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int sum = calc.calcSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), 
				Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		
		float avg = (float)sum / args.length;
		
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
		
		if(avg >= 90 & avg <= 100) {
			System.out.println("A학점");
		} else if(avg >= 70) {
			System.out.println("B학점");
		} else if(avg >= 50) {
			System.out.println("C학점");
		} else if(avg >= 30) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}

}
