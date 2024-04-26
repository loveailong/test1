package cn.edu.scnu.service;

import cn.edu.scnu.entity.Tbbook;
import cn.edu.scnu.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//表示项目启动时创建对象
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Tbbook> showbook() {
        return bookMapper.showbook();
    }

    public int insertTbbook(Tbbook book) {
        return bookMapper.insertBook(book);
    }

    public void updateBook(Tbbook book) {
        bookMapper.updateBook(book);
    }

    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }
}
