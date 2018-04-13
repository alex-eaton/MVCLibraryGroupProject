package edu.dmacc.spring.libraryproject;

public class Book {

	private String bookTitle;
	private String author;
	private String bookDesc;
	private Status bookStatus;
	private String genre;

	public Book() {
		super();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	public Status getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(Status bookStatus) {
		this.bookStatus = bookStatus;
	}

}
