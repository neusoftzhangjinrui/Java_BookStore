package com.jinrui.service.impl;

import com.jinrui.dao.BookDao;
import com.jinrui.dao.impl.BookDaoImpl;
import com.jinrui.pojo.Book;
import com.jinrui.service.BookService;

import java.util.List;

/**
 * @author Jinrui Zhang
 * @create 2021-03-02 20:38
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }
}
