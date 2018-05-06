package main;

import model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
class ArticleService {

    private List<Article> articleList = new ArrayList<>(Arrays.asList(
            new Article("1", "Article 01", "Description 01"),
            new Article("2", "Article 02", "Description 02"),
            new Article("3", "Article 03", "Description 03")
    ));

    List<Article> getAllArticles() {
        return articleList;
    }

    Article getArticle(String id) {
        return articleList.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }
}