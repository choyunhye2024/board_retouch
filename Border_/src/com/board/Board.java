package com.board;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {

	static Board xx = new Board();

	private Board() {

	}

	static Board getInstance() {

		return xx;
	}

	ArrayList<Post> posts = new ArrayList<Post>();
	int count = 0;

	void run() {
		Scanner sc = new Scanner(System.in);

		xx: while (true) {

			System.out.println("[1.리스트 / 2.읽기 / 3.쓰기 / 4.수정 / 5.삭제 / e.종료 ]");
			String cmd = sc.next();
			System.out.println(cmd);

			switch (cmd) {

			case "1":
				System.out.println("=====================리스트======================");
				for (Post p : posts) {

					// p.info();
					System.out.println(p);

				}
				System.out.println("================================================");
				break;

			case "2":
				System.out.println("읽을 글 번호를 입력해주세요:");
				int SelectNo = sc.nextInt();
				for (Post p : posts) {

					if (p.getNo() == SelectNo) {

						p.infoForRead();
					}
				}
				break;

			case "3":
				// 쓰기
				System.out.println("글쓴이:");
				String writer = sc.next();
				System.out.println("글제목:");
				String title = sc.next();
				System.out.println("글내용:");
				String content = sc.next();

				count = count + 1;

				Post p = new Post(count, writer, title, content);
				posts.add(p);

				break;

			case "4":
				System.out.println("수정할 글 번호를 입력해주세요:");
				int selectNo3 = sc.nextInt();

				for (Post p3 : posts) {

					if (p3.getNo() == selectNo3) {

						System.out.println("==========================");
						System.out.println(p3.getContent());
						System.out.println("--------------------------");
						System.out.println("바꿀 내용을 입력하시오");
						String newContent = sc.next();
						// p3.content = newContent; 아래로바뀜
						p3.setContent(newContent);
						break;

					}

				}

			case "5":
				System.out.println("삭제할 글 번호를 입력해주세요:");
				int SelectNoDel = sc.nextInt();
				int searchIndex = -1;

				for (int i = 0; i < posts.size(); i = i + 1) {

					Post pp = posts.get(i);

					if (pp.getNo() == searchIndex) {

						System.out.println("삭제를 완료하였습니다.");
						searchIndex = i;
						break;
					}

				}
				// 삭제
			case "e":
				// 종료
				break xx;

			default:
				break;

			}

		}
	}

}