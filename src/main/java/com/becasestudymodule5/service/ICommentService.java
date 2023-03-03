package com.becasestudymodule5.service;

import com.becasestudymodule5.model.Comment;
import com.becasestudymodule5.model.Post;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICommentService {
    List<Comment> getAllComment();


    @Transactional
    void deleteAllByPost(Long id);
}
