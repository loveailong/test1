package cn.edu.scnu.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Entity(name="tb_book")
@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Integer id;
    private String title;
    private String author;
    private String press;
    private double price;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="bookId")
    private List<TbComment> commentList = new ArrayList<>();
}