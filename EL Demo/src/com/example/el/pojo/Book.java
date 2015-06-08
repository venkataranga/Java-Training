package com.example.el.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Serializable {
	
	private static final long serialVersionUID = -6816059682139123060L;

	String title;
	
	String author;
	String ISBN;
	String keywords;
	int numberOfPages;
	
	public Book(String title, String author, String iSBN, String keywords,
			int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.keywords = keywords;
		this.numberOfPages = numberOfPages;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN
				+ ", keywords=" + keywords
				+ ", numberOfPages=" + numberOfPages + "]";
	}
}
