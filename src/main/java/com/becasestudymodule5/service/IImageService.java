package com.becasestudymodule5.service;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.model.Post;

import java.util.List;
import java.util.Set;

public interface IImageService {

    Image save(Image image);


    List<Image> getAllImgByPostId(Long idPost);


    void deleteImgAllByPost(Long id);

    List<Image> getAllImg();
}
