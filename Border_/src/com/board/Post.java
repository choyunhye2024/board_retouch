package com.board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	private int no;
	private String title;
	private String writer;
	private String content;
	String writeTime;

	public Post(int no, String title, String writer, String content) {

		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;

		Date now = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm");
		writeTime = sdf.format(now);

	}

	void info() {

		String s = String.format("글번호:%s 글제목:%s 글쓴이:%s", no, title, writer);
		System.out.println(s);
	}

	void infoForRead() {

		String s = String.format("글번호:%s 글제목:%s 글쓴이:%s 글작성시간:%s", no, title, writer, writeTime);
		System.out.println(s);
		System.out.println("===============================================");
		System.out.println(content);
		System.out.println("===============================================");

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {

		String s = String.format("글번호:%s 글제목:%s 글쓴이:%s 글작성시간:%s", no, title, writer, writeTime);
		return s;
	}

}
