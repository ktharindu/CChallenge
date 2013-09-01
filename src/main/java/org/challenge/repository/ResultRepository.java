package org.challenge.repository;

import java.util.List;

import org.challenge.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultRepository extends MongoRepository<Result, String> {

	List<Result> findBySubject(String subject);

}
