package com.ll.exam.mybatis_test.article.repository;

import com.ll.exam.mybatis_test.article.dto.Article;
import org.apache.ibatis.annotations.Mapper;
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
}
