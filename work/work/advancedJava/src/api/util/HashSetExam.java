package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//������ ���� ���������� HashSet ��ü 2�� �ۼ��ϱ�
		//set1 -> 1���� 10���� ����
		HashSet<Integer> set = new HashSet<Integer>();
			for (int i=0;i<=10;i++) {
				set.add(i);
			}
			print(set, "set 1~10");
	
		//set2 -> 5���� 15���� ����
		HashSet<Integer> set2 = new HashSet<Integer>();
			for (int i=5;i<=15;i++) {
				set2.add(i);
			}
			print(set2, "set 5~15");
		
		//set1�� set2������ ����ϱ�
		HashSet<Integer> set3 = new HashSet<Integer>(set);
		set3.addAll(set2);
		print(set3, "������");
		
		//set1�� set2������ ����ϱ�
		set.retainAll(set2);
		print(set, "������");
	}
	public static void print(Set<Integer> set,String setName) {
		System.out.println("������=>"+set.size());
		for (int data : set) {
			System.out.println(setName+"�� ����� ���=>"+data);
		}
		System.out.println("===========================================");
	}

}