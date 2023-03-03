package com.becasestudymodule5.repository;

import com.becasestudymodule5.model.Image;
import com.becasestudymodule5.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface IPostRepo extends CrudRepository<Post, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM post ORDER BY id DESC")
    List<Post> getAllPost();


}
