package com.becasestudymodule5.controller;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.model.Post;
import com.becasestudymodule5.service.IImageService;
import com.becasestudymodule5.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class PostController {
    @Autowired
    IPostService iPostService;

    @GetMapping
    public ResponseEntity<List<Post>> getAll() {
        return new ResponseEntity<>(iPostService.getAll(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Post> save(@RequestBody Post post) {
        post.setDateTime(new Date().toString());
        return new ResponseEntity<>(iPostService.save(post), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        iPostService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
