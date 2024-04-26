package cn.edu.scnu.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity(name="comment")
@Data
public class TbComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private String c_author;
    private int bookId;
}