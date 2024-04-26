package cn.edu.scnu.mapper.repository;


import cn.edu.scnu.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends JpaRepository<Books, Integer> {
    @Transactional
    @Modifying
    @Query("update tb_book set title=:#{#book.getTitle()},author=:#{#book.getAuthor()},press=:#{#book.getPress()},price=:#{#book.getPrice()} where id=:#{#book.getId()}")
    void updateBook(Books book);

    @Query(value = "select b.*,c.id c_id,c.content c_content,c.c_author from tb_book b,comment c where b.book_id=c.book_id and b.book_id=?1", nativeQuery = true)
    Books findByIdContain(Integer id);

}
