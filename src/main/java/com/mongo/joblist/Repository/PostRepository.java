package com.mongo.joblist.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.joblist.model.Post;

public interface PostRepository extends MongoRepository<Post,String>{
    
}
