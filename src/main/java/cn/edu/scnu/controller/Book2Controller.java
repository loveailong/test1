package cn.edu.scnu.controller;

import cn.edu.scnu.entity.Tbbook;
import cn.edu.scnu.service.Book2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book2")
public class Book2Controller {
    @Autowired
    private Book2Service book2Service;

    @RequestMapping("/allbooks")
    public List<Tbbook> showbook() {
        return book2Service.showbook();
    }

    @RequestMapping("/insertBook")
    public String insertBook(Tbbook book) {

        System.out.println(book);
        book2Service.insertBook(book);
        System.out.println(book);
        return "添加成功";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Tbbook book) {
        book2Service.updateBook(book);
        return "修改成功";
    }

    @RequestMapping("deleteBook")
    public String deleteBook(Integer id) {
        book2Service.deleteBook(id);
        return "删除成功";
    }

    @RequestMapping("/showComment")
    public Tbbook showComment(Integer id) {
        return book2Service.showComment(id);
    }

    //
    @RequestMapping("/searchBook")
    @ResponseBody
    public List<Tbbook> searchBook(Tbbook book,String min_price,String max_price){
        double minPrice,maxPrice;
        Map<String,Object> map = new HashMap<>();
        map.put("title",book.getTitle());
        map.put("author",book.getAuthor());
        map.put("press",book.getPress());
        map.put("minPrice",book.getPrice());
        if(min_price =="" || min_price==null){
            minPrice=0.0;
        }else{
            minPrice=Double.valueOf(min_price);
        }
        map.put("minPrice",minPrice);

        if(max_price =="" || max_price==null){
            maxPrice=Double.MAX_VALUE;
        }else{
            maxPrice=Double.valueOf(max_price);
        }
        if(maxPrice<book.getPrice()){
            maxPrice=Double.MAX_VALUE;
        }
        map.put("maxPrice",maxPrice);
        return book2Service.searchBook(map);
    }

}