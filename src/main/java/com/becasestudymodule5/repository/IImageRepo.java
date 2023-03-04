package com.becasestudymodule5.repository;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.model.Post;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface IImageRepo extends CrudRepository<Image,Long> {
//    @Query(nativeQuery = true, value = "SELECT * from image join post_images on images_id = image.id where post_id=:id")
//    Set<Image> findAllImgByPost(Long id);
    List<Image> findImagesByPostId(long id);

    Long deleteImagesByPostId(long id);
}
