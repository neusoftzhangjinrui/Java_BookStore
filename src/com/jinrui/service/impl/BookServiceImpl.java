package com.jinrui.service.impl;

import com.jinrui.dao.BookDao;
import com.jinrui.dao.impl.BookDaoImpl;
import com.jinrui.pojo.Book;
import com.jinrui.pojo.Page;
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

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> page = new Page<Book>();
        page.setPageSize(pageSize);
        Integer pageTotalCount = bookDao.queryForTotalCount();
        page.setPageTotalCount(pageTotalCount);
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
        page.setPageTotal(pageTotal);
        page.setPageNo(pageNo);
        int begin = (page.getPageNo() - 1) * pageSize;
        List<Book> items = bookDao.queryForPageItems(begin, pageSize);
        page.setItems(items);
        return page;
    }
}
