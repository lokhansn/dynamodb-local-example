package com.sgl.dynamodb.api.repository;

import com.sgl.dynamodb.api.model.Author;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
@EnableScan()
public interface AuthorRepository extends CrudRepository<Author, String> {
}