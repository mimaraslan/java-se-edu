package com.abc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abc.model.Tutorial;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
