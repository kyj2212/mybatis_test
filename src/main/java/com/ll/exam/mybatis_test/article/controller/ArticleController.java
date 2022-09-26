package com.ll.exam.mybatis_test.article.controller;

import com.ll.exam.mybatis_test.article.dto.Article;
import com.ll.exam.mybatis_test.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list")
    @ResponseBody
    public List<Article> list(){
        List<Article> articles = articleService.getArticles();
        return articles;
    }

    @GetMapping("/article/{id}")
    @ResponseBody
    public Article detail(@PathParam("id") Long id){
        Article article = articleService.getArticleById(id);
        return article;
    }
}
