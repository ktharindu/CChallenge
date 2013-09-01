package org.challenge.repository;

import org.challenge.model.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School, String> {
}
