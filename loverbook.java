package loverbook;

import java.util.Scanner;


public class loverbook {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int l_menu=0;
		
		System.out.println("<Ȩ �޴�>");
		System.out.println("1. �л�");
		System.out.println("2. �缭");
		System.out.println("������ �����Ͻÿ� : ");
		int h_menu = s.nextInt();
		
		System.out.println("�Է¹��� �޴��� "+ h_menu + "�̴�.");
		
		System.out.println("git hub test");
		
		if(h_menu == 1){
			while (l_menu != 3)
			{
			System.out.println("<�л� �޴�>");
			System.out.println("1. ���� �˻� �� ����");
			System.out.println("2. ���� ���� ���� ��� Ȯ��");
			System.out.println("3. ����");
			System.out.println("�׸��� �����Ͻÿ� : ");
			l_menu = s.nextInt();
			}
			
		}
		
		else{//librarian
			while (l_menu != 4)
			{
			System.out.println("<�缭 �޴�>");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ����");
			System.out.println("�׸��� �����Ͻÿ� : ");
			l_menu = s.nextInt();
			}
			
			
		}
		
	}

}
