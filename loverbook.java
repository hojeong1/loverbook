package loverbook;

import java.util.Scanner;


public class loverbook {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("<홈 메뉴>");
		System.out.println("1. 학생");
		System.out.println("2. 사서");
		System.out.println("권한을 선택하시오 : ");
		int h_menu = s.nextInt();
		
		System.out.println("입력받은 메뉴는 "+ h_menu + "이다.");
		
		System.out.println("git hub test");
		
		if(h_menu == 1){
			
		}
		
		else{//librarian
			System.out.println("<사서 메뉴>");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 정보 수정");
			System.out.println("3. 도서 삭제");
			System.out.println("항목을 선택하시오 : ");
			int l_menu = s.nextInt();
		}
		
	}

}
