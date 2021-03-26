package com.ibm.lib;
public class Book {
	private int isbn;
	private String title;
	private Member mem;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public void status() {
		if(mem == null) {
			System.out.println("This book is not issued by any member");
			
		}
		else
			System.out.println("Book is issued by "+mem.getName());
		
	}

	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	
	public void issueBook(Member mem) throws LibraryException {
		if(this.mem != null)
			throw new LibraryException("cannot issue book, already issued");
		else if(mem.getBook() != null) {
			throw new LibraryException("member has already issued a bbook");
		}
		else {
				this.mem=mem;
				mem.setBook(this);
			}
		
	}
	
	public void returnBook(Member mem) throws LibraryException {
		if(this.mem == null)
			throw new LibraryException("this book is not issued by anyone");
		else {
		this.mem=null;
		mem.setBook(null);}
	}
	
	
}
