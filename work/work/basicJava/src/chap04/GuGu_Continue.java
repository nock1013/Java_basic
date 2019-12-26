package chap04;
//Continue문 연습 - 선언된 위치 아래의 코드를 skip하기 위해 사용.
public class GuGu_Continue {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++)
		{
			if(i == 5) {
				continue;
			}
			for(int j = 1; j <= 9; j++)
			{
				/*if(i == 5) { break문이 내부 for에 선언되어 있으므로
					break;	      반복문이 종료되지는 않는다.
				}*/
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		/*for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}*/

	}

}
