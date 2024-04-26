package cn.edu.scnu.service;
import cn.edu.scnu.entity.Tbbook;
import cn.edu.scnu.mapper.Book2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class Book2Service {
    @Autowired
    private Book2Mapper book2Mapper;
    public List<Tbbook> showbook() {
        return book2Mapper.showbook();
    }
    public void insertBook(Tbbook book) {
        book2Mapper.insertBook(book);
    }
    public void updateBook(Tbbook book) {
        book2Mapper.updateBook(book);
    }
    public void deleteBook(int id) {
        book2Mapper.deleteBook(id);
    }
    public Tbbook showComment(int id) {
        return book2Mapper.showComment(id);
    }

    public List<Tbbook> searchBook(Map<String, Object> map) {
        return book2Mapper.searchBook(map);
    }
}