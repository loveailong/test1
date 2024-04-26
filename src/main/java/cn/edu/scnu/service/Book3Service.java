package cn.edu.scnu.service;

import cn.edu.scnu.entity.Books;
import cn.edu.scnu.mapper.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book3Service {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> showbook() {
        return bookRepository.findAll();
    }

    public void insertTbBook(Books book) {
        bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Books book) {
        bookRepository.updateBook(book);
    }

    public Books showComment(Integer id) {
        return bookRepository.findByIdContain(id);
    }
}
