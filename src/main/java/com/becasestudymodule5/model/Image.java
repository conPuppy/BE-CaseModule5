package com.becasestudymodule5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "post_id", referencedColumnName = "id", onDelete = CascadeType.CASCADE)
    @ManyToOne
    private Post post;

}
