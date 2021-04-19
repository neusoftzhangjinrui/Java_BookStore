package com.jinrui.service;

import com.jinrui.pojo.Book;
import com.jinrui.pojo.Page;

import java.util.List;

/**
 * @author Jinrui Zhang
 * @create 2021-03-02 20:37
 */
public interface BookService {
    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
    public  Page<Book> page(int pageNo, int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
