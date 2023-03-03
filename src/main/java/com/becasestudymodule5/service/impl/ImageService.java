package com.becasestudymodule5.service.impl;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.model.Post;
import com.becasestudymodule5.repository.IImageRepo;
import com.becasestudymodule5.repository.IPostRepo;
import com.becasestudymodule5.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class ImageService implements IImageService {
    @Autowired
    IImageRepo iImageRepo;

    @Override
    public Image save(Image image) {
        return iImageRepo.save(image);
    }
    @Override
    public Set<Image> getAllImgByPost(Post post) {
        return iImageRepo.findImagesByPost(post);
    }
    @Override
    @Transactional
    public void deleteImgAllByPost(Long id) {
        iImageRepo.deleteImagesByPostId(id);
    }
    @Override
    public List<Image> getAllImg() {
        return (List<Image>) iImageRepo.findAll();
    }
}
