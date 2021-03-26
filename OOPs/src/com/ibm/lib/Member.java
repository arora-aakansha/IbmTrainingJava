package com.ibm.lib;

public class Member {
	private int mid;
	private String name;
	private Book book;
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public void status() {
		if(book == null)
			System.out.println("Meber has not issued any book");
		else
			System.out.println("Member has issued "+  book.getTitle());
		
	}


	public Member(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
