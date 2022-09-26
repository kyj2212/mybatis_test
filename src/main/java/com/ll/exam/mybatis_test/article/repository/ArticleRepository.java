package com.ll.exam.mybatis_test.article.repository;

import com.ll.exam.mybatis_test.article.dto.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleRepository {

    @Select("""
                <script>
                select * from article
                </script>
                """)
    public List<Article> getArticles();

    @Insert("""
            <script>
            INSERT INTO article
            SET createDate=NOW(),
            modifyDate=NOW(),
            subject= #{subject},
            content= #{content}
            </script>
            """)
    void write(@Param("subject") String subject, String content);

    @Select("""
                <script>
                select * from article
                where id = #{id}
                </script>
                """)
    Article getArticleById(@Param("id") Long id);
}
