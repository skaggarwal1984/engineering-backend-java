package com.engineering.articles;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CassandraRepository<Article, Long> {
}
