package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//FileTest01.java���� copy�ϱ�
		//1. FileReader�� �а� FileWriter�� ����ϱ�
		//2. src/data/copy_result.txt�� �����ϱ�
		//3. �ַܼε� ��µǵ��� �ۼ�
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("src/api/io/FileTest01.java");
			fw = new FileWriter("src/data/copy_result.txt");
			while(true) {
				int data = fr.read();
				fw.write(data);
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(fw!=null)fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

