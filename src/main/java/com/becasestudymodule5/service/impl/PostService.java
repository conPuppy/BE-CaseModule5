package com.becasestudymodule5.service.impl;

import com.becasestudymodule5.model.Post;
import com.becasestudymodule5.repository.IImageRepo;
import com.becasestudymodule5.repository.IPostRepo;
import com.becasestudymodule5.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService implements IPostService {
    @Autowired
    IPostRepo iPostRepo;

    @Override
    public List<Post> getAll() {
        return iPostRepo.getAllPost();
    }
    @Override
    public Post save(Post post) {
        return iPostRepo.save(post);
    }
    @Override
    public Post findPostById(Long id) {
        return iPostRepo.findById(id).get();
    }
    @Override
    public void deletePost(Long id) {
        iPostRepo.deleteById(id);
    }

}
