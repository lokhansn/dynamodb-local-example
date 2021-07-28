package com.sgl.dynamodb.api.repository;

import com.sgl.dynamodb.api.model.Lend;
import com.sgl.dynamodb.api.model.LendStatus;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
@EnableScan()
public interface LendRepository extends CrudRepository<Lend, String> {
    Optional<Lend> findByBookIdAndStatus(String bookId, LendStatus status);
}