package com.ll.exam.mybatis_test.article.service;

import com.ll.exam.mybatis_test.article.dto.Article;
import com.ll.exam.mybatis_test.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    public List<Article> getArticles(){
        return articleRepository.getArticles();
    }
}
