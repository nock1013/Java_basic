package chap08;

public class CalcTest {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		double result = obj.divide(num1, num2);
		System.out.println("°á°ú:"+result);
	}

}
