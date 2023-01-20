package com.web.model;

public class Books {
	private String bookID ;
	private String bookName;
	private String authorName;
	private String publisher;
	

	public Books() {

	}

	public Books(String bookID, String bookName, String authorName, String publisher) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", authorName=" + authorName + ", publisher="
				+ publisher + "]";
	}
	

}
