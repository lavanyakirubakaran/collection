package com.java1;
import java.util.*;
public class BookExampl {
	private int bookid;
	private String bookname;
	private String author;
	private long price;
	BookExampl(int bookid,String bookname, String author, long price)
	{
		this.bookid=bookid;
	this.bookname=bookname; 
	this.author=author;
	this.price=price; }
	@Override
	public String toString() {
		return "[bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price+ "]";}}
