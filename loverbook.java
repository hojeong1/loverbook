package loverbook;

import java.util.Scanner;


public class loverbook {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int l_menu=0;
		int s_menu=0;
		String s_id, s_name, s_major;
		int s_pw, s_num;

		System.out.println("<Ȩ �޴�>");
		System.out.println("1. �л�");
		System.out.println("2. �缭");
		System.out.println("������ �����Ͻÿ� : ");
		int h_menu = s.nextInt();

		if(h_menu == 1){
			while(true){
				System.out.println("1.ȸ������    2.�α���");
				System.out.println("�׸��� �����ϼ��� : ");
				int login = s.nextInt();

				if(login == 1){
					System.out.print("ID�� �Է��ϼ��� : ");
					s_id = s.next();
					System.out.print("��й�ȣ�� �Է��ϼ��� : ");
					s_pw = s.nextInt();
					System.out.print("�̸��� �Է��ϼ��� : ");
					s_name = s.next();
					System.out.print("������ �Է��ϼ��� : ");
					s_major = s.next();
					System.out.print("�й��� �Է��ϼ��� : ");
					s_num = s.nextInt();
					System.out.println("---�����մϴ�. ������ �Ϸ�Ǿ����ϴ�.---");
					System.out.println("ID : "+s_id);
					System.out.println("�̸� : "+s_name);
					System.out.println("���� : "+s_major);
					System.out.println("�й� : "+s_num);
					System.out.println("--------------------------------");
					System.out.println();
				}

				else{
					while (l_menu != 3)
					{
						System.out.println("<�л� �޴�>");
						System.out.println("1. ���� �˻� �� ����");
						System.out.println("2. ���� ���� ���� ��� Ȯ��");
						System.out.println("�׸��� �����Ͻÿ� : ");
						s_menu = s.nextInt();
					}
				}
			}

		}

		else{//librarian
			while(true){
				System.out.println("�缭 ��й�ȣ�� �Է��ϼ��� : ");
				int l_secret = s.nextInt();

				if(l_secret == 0000000){
					while (l_menu != 4)
					{
						System.out.println("<�缭 �޴�>");
						System.out.println("1. ���� ���");
						System.out.println("2. ���� ���� ����");
						System.out.println("3. ���� ����");
						System.out.println("�׸��� �����Ͻÿ� : ");
						l_menu = s.nextInt();
					}
				}

				else{
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.�ٽ� �Է��� �ּ���.");
				}
			}

		}

	}

}
