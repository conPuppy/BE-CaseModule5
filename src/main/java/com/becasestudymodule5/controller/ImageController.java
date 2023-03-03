package com.becasestudymodule5.controller;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.service.IImageService;
import com.becasestudymodule5.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/images")
@CrossOrigin("*")
public class ImageController {
    @Autowired
    IImageService iImageService;
    @Autowired
    IPostService iPostService;
    @GetMapping
    public ResponseEntity<List<Image>> getAllImg() {
        return new ResponseEntity<>(iImageService.getAllImg(),HttpStatus.OK);
    }
    @GetMapping("/{postId}")
    public ResponseEntity<Set<Image>> getAllImgByPost(@PathVariable Long postId) {
        return new ResponseEntity<>(iImageService.getAllImgByPost(iPostService.findPostById(postId)), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Image> saveImg(@RequestBody Image image) {
        return new ResponseEntity<>(iImageService.save(image),HttpStatus.OK);
    }
    @DeleteMapping("/{postId}")
    public ResponseEntity<?> deleteImgByPost(@PathVariable Long postId) {
        iImageService.deleteImgAllByPost(postId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
