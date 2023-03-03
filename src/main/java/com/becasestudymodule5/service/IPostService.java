package com.becasestudymodule5.service;

import com.becasestudymodule5.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPostService {
    List<Post> getAll();

    Post save(Post post);

    Post findPostById(Long id);

    void deletePost(Long id);
}
