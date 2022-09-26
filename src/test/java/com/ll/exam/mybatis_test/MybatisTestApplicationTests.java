package com.ll.exam.mybatis_test;

import com.ll.exam.mybatis_test.article.dto.Article;
import com.ll.exam.mybatis_test.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
@Transactional
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

	@Test
	@DisplayName("게시물 추가")
	void t2(){
		articleService.write("제목2","내용2");
		articleService.write("제목3","내용3");
		System.out.println(articleService.getArticles());
	}

	@Test
	@DisplayName("게시물 id=1 인 단건 조회")
	void t3(){
		Article article=articleService.getArticleById(1L);
		System.out.println(article);
		assertThat(article).isNotNull();
	}


}
