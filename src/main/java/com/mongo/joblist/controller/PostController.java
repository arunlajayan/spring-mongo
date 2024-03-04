package com.mongo.joblist.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.joblist.Repository.PostRepository;
import com.mongo.joblist.Repository.SearchRepository;
import com.mongo.joblist.model.Post;


@RestController

public class PostController {
    @Autowired
    PostRepository postRepo;
    
    @Autowired
    SearchRepository searchRepo;

  @GetMapping("/posts")
  public List<Post> getAll() {
      return postRepo.findAll();
  }
    @PostMapping("/posts")
  
    public Post addPost(@RequestBody Post post)
    {
        return postRepo.save(post);
    }


    @GetMapping("/posts/{text}")
   
    public List<Post> search(@PathVariable String text)
    {
        return searchRepo.findByText(text);
    }
}
