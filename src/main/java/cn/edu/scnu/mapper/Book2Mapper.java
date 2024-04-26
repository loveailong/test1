package cn.edu.scnu.mapper;
import cn.edu.scnu.entity.Tbbook;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface Book2Mapper {
    List<Tbbook> showbook();
    int insertBook(Tbbook book);
    void updateBook(Tbbook book);
    void deleteBook(Integer id);
    Tbbook showComment(Integer id);
    List<Tbbook> searchBook(Map<String, Object> map);
}