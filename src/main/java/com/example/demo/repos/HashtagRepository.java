package com.example.demo.repos;

import com.example.demo.models.Hashtag;
import org.springframework.data.repository.CrudRepository;

public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
}
