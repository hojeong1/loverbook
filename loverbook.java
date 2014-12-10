package loverbook;

import java.util.Scanner;


public class loverbook {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int l_menu=0;
		int s_menu=0;
		String s_id = null, s_name, s_major;
		int s_pw = 0, s_num;
		String book[] = new String[6];
		int booknum = 1;

		System.out.println("<홈 메뉴>");
		System.out.println("1. 학생");
		System.out.println("2. 사서");
		System.out.println("권한을 선택하시오 : ");
		int h_menu = s.nextInt();

		if(h_menu == 1){
			while(true){
				System.out.println("1.회원가입    2.로그인");
				System.out.println("항목을 선택하세요 : ");
				int login = s.nextInt();

				if(login == 1){
					System.out.println("ID를 입력하세요 : ");
					s_id = s.next();
					System.out.println("비밀번호를 입력하세요 : ");
					s_pw = s.nextInt();
					System.out.println("이름를 입력하세요 : ");
					s_name = s.next();
					System.out.println("전공를 입력하세요 : ");
					s_major = s.next();
					System.out.println("학번를 입력하세요 : ");
					s_num = s.nextInt();
					System.out.println("---축하합니다. 가입이 완료되었습니다.---");
					System.out.println("ID : "+s_id);
					System.out.println("이름 : "+s_name);
					System.out.println("전공 : "+s_major);
					System.out.println("학번 : "+s_num);
					System.out.println("--------------------------------");
					System.out.println();
				}


				else if(login == 2){
					System.out.println("-----<로그인>-----");
					System.out.println("ID : ");
					String id = s.next();
					System.out.println("비밀번호 : ");
					int pw = s.nextInt();

					if(id.equals(s_id)){
						if(pw==s_pw){
							while (l_menu != 3)
							{
								System.out.println("<학생 메뉴>");
								System.out.println("1. 도서 검색 및 대출");
								System.out.println("2. 내가 빌린 도서 목록 확인");
								System.out.println("항목을 선택하시오 : ");
								s_menu = s.nextInt();

								if(s_menu == 1){
									System.out.println("검색 : ");
								}
								else if(s_menu == 2){
									//로그인 아이디에 해당하는 사람이 빌린 도서의 목록
								}
							}
						}

						else
							System.out.println("비밀번호가 일치하지 않습니다.");
					}
					else
						System.out.println("ID가 일치하지 않습니다.");

				}
			}

		}

		else{//librarian
			while(true){
				System.out.println("사서 비밀번호를 입력하세요 : ");
				int l_secret = s.nextInt();

				if(l_secret == 0000000){
					while (l_menu != 4)
					{
						System.out.println("<사서 메뉴>");
						System.out.println("1. 도서 등록");
						System.out.println("2. 도서 정보 수정");
						System.out.println("3. 도서 삭제");
						System.out.println("항목을 선택하시오 : ");
						l_menu = s.nextInt();

						if(l_menu == 1){
							System.out.println("도서 제목 : ");
							book[0] = s.next();
							System.out.println("저자 : ");
							book[1] = s.next();
							System.out.println("출판사 : ");
							book[2] = s.next();
							book[3] = String.valueOf(booknum);
							book[4] = "O";
							book[5] = "0000000";
							booknum++;

							System.out.println("도서 등록이 완료되었습니다.");
							for(int i = 0; i<6;i++){
								System.out.print(book[i]+" | ");

							}
							System.out.println();
						}

						else if(l_menu == 2){
							System.out.println("수정할 도서의 번호를 입력하세요: ");


						}
						System.out.println();
					}
					else if(l_menu == 2){
						System.out.println("수정할 도서의 번호를 입력하세요: ");
					}
				}
			}

			else{
				System.out.println("비밀번호가 틀렸습니다.다시 입력해 주세요.");
			}
		}

	}


}


}
}
