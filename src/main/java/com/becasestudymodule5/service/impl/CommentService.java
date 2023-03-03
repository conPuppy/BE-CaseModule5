package com.becasestudymodule5.service.impl;

import com.becasestudymodule5.model.Comment;
import com.becasestudymodule5.repository.ICommentRepo;
import com.becasestudymodule5.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    @Override
    public List<Comment> getAllComment() {
        return (List<Comment>) iCommentRepo.findAll();
    }
    @Override
    @Transactional
    public void deleteAllByPost(Long id) {
        iCommentRepo.deleteCommentsByPostId(id);
    }
}
