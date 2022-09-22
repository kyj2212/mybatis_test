package com.ll.exam.mybatis_test;

import com.ll.exam.mybatis_test.article.dto.Article;
import com.ll.exam.mybatis_test.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ArticleService articleService;

	@Test
	@DisplayName("게시물 리스트 반환")
	void t1() {
		List<Article> articles = articleService.getArticles();
		System.out.println(articles);
	}
}
