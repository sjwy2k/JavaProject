package com.kh.board.run;

import com.kh.board.controller.Board;

public class Main {

	public static void main(String[] args) {
		
		Board[] boards=new Board[5];
		
		Board board1=new Board();
		Board board2=new Board();
		Board board3=new Board();
		Board board4=new Board();
		
		//첫번째 게시판 글 등록
		board1.setBoardNum(1);
		board1.setId("홍길동");
		board1.setTitle("처음 등록하는 게시글입니다.");
		board1.setContent("이렇게 글 쓰는거 맞나??");
		board1.setCount(3);
		
		
		board2.setBoardNum(2);
		board2.setId("장보고");
		board2.setTitle("게시글 쓰기 힘듭니다");
		board2.setContent("먹고살기도 힘듭니다");
		board2.setCount(10);
		
		board3.setBoardNum(3);
		board3.setId("김유신");
		board3.setTitle("Rclass 게시글");
		board3.setContent("khacademy");
		board3.setCount(7);
		
		board4.setBoardNum(4);
		board4.setId("임걱정");
		board4.setTitle("게시판!");
		board4.setContent("글내용!");
		board4.setCount(11);
		
		Board bd=null;
		for(int i=0; i<boards.length; i++) {
			switch(i) {
				case 0:bd=board1;break;
				case 1:bd=board2;break;
				case 2:bd=board3;break;
				case 3:bd=board4;break;
			}
			boards[i]=bd;
		}
		
		for(int i=0; i<boards.length; i++) {
			System.out.println("---------------------------------------------");
			System.out.println("글번호 : "+boards[i].getBoardNum());
			System.out.println("아이디 : "+boards[i].getId());
			System.out.println("글제목 : "+boards[i].getTitle());
			System.out.println("글내용 : "+boards[i].getContent());			
			System.out.println("조회수 : "+boards[i].getCount());
			
		}
	}

}
