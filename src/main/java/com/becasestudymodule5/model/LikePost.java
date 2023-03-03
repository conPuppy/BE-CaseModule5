package com.becasestudymodule5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LikePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Post post;
    @OneToOne
    private Account account;

}
