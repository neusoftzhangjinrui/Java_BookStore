package com.jinrui.service;

import com.jinrui.pojo.Book;

import java.util.List;

/**
 * @author Jinrui Zhang
 * @create 2021-03-02 20:37
 */
public interface BookService {
    public void addBook(Book book);
    public void deleteBookById(Integer id);public void updateBook(Book book);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();
}
