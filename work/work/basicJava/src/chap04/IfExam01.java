package chap04;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// 숫자를 입력받아 음수인지 양수인지 츨력
		// 단, 양수인 경우 짝수인지 홀수인지 출력
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char c = 'A';
		System.out.println((int)c);
		if(num < 0)
		{
			System.out.println(num + "은(는) 음수입니다.");
		}
		else
		{
			if(num % 2 == 0)
			{
				System.out.println(num + "은(는) 짝수입니다.");
			}
			else
			{
				System.out.println(num + "은(는) 홀수입니다.");
			}
		}
	}

}
