package chap04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		//Scanner로 점수를 입력 받아 90점 이상이면 "통과" 아니면 "재시험"
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		if(score >= 90)
		{
			System.out.println("통과");	
		}
		else
		{
			System.out.println("재시험");
		}

	}

}
