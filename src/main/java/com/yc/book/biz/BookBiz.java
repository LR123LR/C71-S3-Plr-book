package com.yc.book.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yc.book.bean.Book;
import com.yc.book.dao.BookDao;

@Component
public class BookBiz {
	@Resource
	private BookDao bdao;
	
	public List<Book> selectAll(){
		return bdao.selectAll();
	}
	
	public int del(String bookid) {
		return bdao.del(bookid);
	}

	public Book selectByBookId(String bookid) {
		return bdao.selectByBookId(bookid);
	}

	public int update(Book book) {
		return bdao.updateBook(book);
	}

	public int insert(Book book) {
		return bdao.insert(book);
	}

	public List<Book> fuzzyQuery(String qbookname, String qbookpress, String qbookauthor) {
		
		return bdao.fuzzyQuery(qbookname,qbookpress,qbookauthor);
	}

}