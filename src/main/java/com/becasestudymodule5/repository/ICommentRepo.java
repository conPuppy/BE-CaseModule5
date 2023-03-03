package com.becasestudymodule5.repository;

import com.becasestudymodule5.model.Comment;
import com.becasestudymodule5.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface ICommentRepo extends CrudRepository<Comment,Long> {
    Long deleteCommentsByPostId(long id);
}
