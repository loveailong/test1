package cn.edu.scnu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private int id;
    private String content;
    private String cAuthor;
    private int bookId;

//    public Comment() {
//    }
//
//    public Comment(int id, String content, String cAuthor, int bookId) {
//        this.id = id;
//        this.content = content;
//        this.cAuthor = cAuthor;
//        this.bookId = bookId;
//    }
//
//    /**
//     * 获取
//     * @return id
//     */
//    public int getId() {
//        return id;
//    }
//
//    /**
//     * 设置
//     * @param id
//     */
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    /**
//     * 获取
//     * @return content
//     */
//    public String getContent() {
//        return content;
//    }
//
//    /**
//     * 设置
//     * @param content
//     */
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    /**
//     * 获取
//     * @return cAuthor
//     */
//    public String getCAuthor() {
//        return cAuthor;
//    }
//
//    /**
//     * 设置
//     * @param cAuthor
//     */
//    public void setCAuthor(String cAuthor) {
//        this.cAuthor = cAuthor;
//    }
//
//    /**
//     * 获取
//     * @return bookId
//     */
//    public int getBookId() {
//        return bookId;
//    }
//
//    /**
//     * 设置
//     * @param bookId
//     */
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String toString() {
//        return "Comment{id = " + id + ", content = " + content + ", cAuthor = " + cAuthor + ", bookId = " + bookId + "}";
//    }
}