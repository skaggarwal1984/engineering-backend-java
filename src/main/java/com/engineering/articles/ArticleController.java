package com.engineering.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles")
    public List<Map<String, String>> getArticles() {
        return articleRepository.findAll().stream()
            .map(article -> Map.of(
                "title", article.getTitle(),
                "description", article.getDescription(),
                "link", article.getLink(),
                "image", article.getImage()
            ))
            .collect(Collectors.toList());
    }
}
