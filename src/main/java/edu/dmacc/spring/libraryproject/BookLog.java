package edu.dmacc.spring.libraryproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booklog")
public class BookLog {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="checkedout")
	private boolean checkedout;
	@ManyToOne
	@JoinColumn(name="bookid")
	private Book book;
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	public BookLog() {
	}

	public BookLog(int id, Book book, User user) {
		super();
		this.id = id;
		this.book = book;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isCheckedout() {
		return checkedout;
	}

	public void setCheckedout(boolean checkedout) {
		this.checkedout = checkedout;
	}
	
}
