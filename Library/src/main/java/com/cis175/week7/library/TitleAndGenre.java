package com.cis175.week7.library;

import javax.persistence.Column;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

//@Entity
@Table(name="books")
@SecondaryTable(name="magazines")
public class TitleAndGenre {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String bookTitle;
	private String genre;

	@Column(name="title")
	private String magazineTitle;
	
	public TitleAndGenre(String object, String object2, String object3) {
		// TODO Auto-generated constructor stub
		bookTitle = object;
		magazineTitle = object2;
		genre = object3;
		
	}
	public String getTitle() {
		return magazineTitle;
	}
	public void setTitle(String title) {
		this.magazineTitle = title;
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

}
