package com.mongo.joblist.Repository;

import java.util.List;
import com.mongo.joblist.model.Post;


public interface SearchRepository {
  
    List<Post> findByText(String text);
}