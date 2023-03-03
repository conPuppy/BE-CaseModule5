package com.becasestudymodule5.controller;

import com.becasestudymodule5.model.Comment;
import com.becasestudymodule5.service.ICommentService;
import com.becasestudymodule5.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin("*")
public class CommentController {
    @Autowired
    ICommentService iCommentService;


    @GetMapping
    public ResponseEntity<List<Comment>> getAllCmt() {
        return new ResponseEntity<>(iCommentService.getAllComment(), HttpStatus.OK);
    }
    @DeleteMapping("/{postId}")
    public ResponseEntity<?> deleteImgByPost(@PathVariable Long postId) {
        iCommentService.deleteAllByPost(postId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}