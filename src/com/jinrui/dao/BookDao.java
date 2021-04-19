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

    Integer queryForTotalCountByPrice(int min, int max);

    List<Book> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
