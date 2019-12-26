package chap05;

public class Array2DExam01 {

	public static void main(String[] args) {
		// 2차원 배열을 생성
		int[][] arr = new int[5][5];
		
		// 2차원 배열에 값을 저장하기 - setting
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = 5 * i + (j + 1) ;
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===================================");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(i == j)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(arr[i][j] + "\t");
				}	
			}
			System.out.println();
		}

	}

}
