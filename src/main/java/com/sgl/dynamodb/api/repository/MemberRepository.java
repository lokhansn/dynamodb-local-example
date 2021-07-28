package com.sgl.dynamodb.api.repository;

import com.sgl.dynamodb.api.model.Member;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan()
public interface MemberRepository extends CrudRepository<Member, String> {
}
