package cn.edu.scnu.controller;

import cn.edu.scnu.entity.Books;
import cn.edu.scnu.service.Book3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book3")
public class Book3Controller {
    @Autowired
    private Book3Service book3Service;

    @RequestMapping("/allbooks")
    public List<Books> showbook() {
        return book3Service.showbook();
    }

    @RequestMapping("/insertBook")
    public String insertBook(Books book) {
        System.out.println(book);
        book3Service.insertTbBook(book);
        System.out.println(book);
        return "添加成功";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book) {
        book3Service.updateBook(book);
        return "修改成功";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(Integer id) {
        book3Service.deleteBook(id);
        return "删除成功";
    }

    @RequestMapping("/showComment")
    public Books showComment(Integer id) {
        return book3Service.showComment(id);
    }
}
