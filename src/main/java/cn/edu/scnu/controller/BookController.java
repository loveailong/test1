package cn.edu.scnu.controller;

import cn.edu.scnu.entity.Tbbook;
import cn.edu.scnu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/allbooks")
    @ResponseBody
    public List<Tbbook> showbook() {
        return bookService.showbook();
    }

    @RequestMapping("/insertBook")
    @ResponseBody
    public String insertBook(Tbbook book) {
        bookService.insertTbbook(book);
        return "添加成功";
    }

    @RequestMapping("/updateBook")
    @ResponseBody
    public String updateBook(Tbbook book) {
        bookService.updateBook(book);
        return "修改成功";
    }

    @RequestMapping("deleteBook")
    @ResponseBody
    public String deleteBook(Integer id) {
        bookService.deleteBook(id);
        return "删除成功";
    }

    @GetMapping("/index1")
    public String index1() {
        return "index1";
    }

    @GetMapping("/index2")
    public String index2() {
        return "index2";
    }
}
