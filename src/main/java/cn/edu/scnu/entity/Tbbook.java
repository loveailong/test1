package cn.edu.scnu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //生成get set方法
@NoArgsConstructor //生成无参构造方法
@AllArgsConstructor //生成有参构造方法
public class Tbbook { //书籍实体类
    private int id;
    private String title;
    private String author;
    private String press;
    private Double price;
    private List<Comment> commentList;

//    public Tbbook() {
//    }
//
//    public Tbbook(int id, String title, String author, String press, double price, List<Comment> commentList) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.press = press;
//        this.price = price;
//        this.commentList = commentList;
//    }
//
//    /**
//     * 获取
//     *
//     * @return id
//     */
//    public int getId() {
//        return id;
//    }
//
//    /**
//     * 设置
//     *
//     * @param id
//     */
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    /**
//     * 获取
//     *
//     * @return title
//     */
//    public String getTitle() {
//        return title;
//    }
//
//    /**
//     * 设置
//     *
//     * @param title
//     */
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    /**
//     * 获取
//     *
//     * @return author
//     */
//    public String getAuthor() {
//        return author;
//    }
//
//    /**
//     * 设置
//     *
//     * @param author
//     */
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    /**
//     * 获取
//     *
//     * @return press
//     */
//    public String getPress() {
//        return press;
//    }
//
//    /**
//     * 设置
//     *
//     * @param press
//     */
//    public void setPress(String press) {
//        this.press = press;
//    }
//
//    /**
//     * 获取
//     *
//     * @return price
//     */
//    public double getPrice() {
//        return price;
//    }
//
//    /**
//     * 设置
//     *
//     * @param price
//     */
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    /**
//     * 获取
//     *
//     * @return commentList
//     */
//    public List<Comment> getCommentList() {
//        return commentList;
//    }
//
//    /**
//     * 设置
//     *
//     * @param commentList
//     */
//    public void setCommentList(List<Comment> commentList) {
//        this.commentList = commentList;
//    }
//
//    public String toString() {
//        return "Tbbook{id = " + id + ", title = " + title + ", author = " + author + ", press = " + press + ", price = " + price + ", commentList = " + commentList + "}";
//    }
}