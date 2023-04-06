package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    
}
