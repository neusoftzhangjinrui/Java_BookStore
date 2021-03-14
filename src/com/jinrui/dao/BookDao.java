package com.jinrui.dao;

import com.jinrui.pojo.Book;

import java.util.List;

/**
 * @author Jinrui Zhang
 * @create 2021-03-02 20:23
 */
public interface BookDao {
    public int addBook(Book book);
    public int deleteBookById(Integer id);
    public int updateBook(Book book);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();
    Integer queryForTotalCount();
    List<Book> queryForPageItems(int begin,int pageSize);
}
