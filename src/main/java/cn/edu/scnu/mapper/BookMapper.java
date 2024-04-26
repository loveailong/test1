package cn.edu.scnu.mapper;

import cn.edu.scnu.entity.Tbbook;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from tbbook")
    public List<Tbbook> showbook();
    @Insert("insert into Tbbook(title,author,press,price) values(#{title},#{author},#{press},#{price})")
    public int insertBook(Tbbook book);

    @Update("update Tbbook set title=#{title},author=#{author},press=#{press},price=#{price} where id=#{id}")
    public void updateBook(Tbbook book);
    @Delete("delete from Tbbook where id = #{id}")
    void deleteBook(Integer id); //删除书籍
}
