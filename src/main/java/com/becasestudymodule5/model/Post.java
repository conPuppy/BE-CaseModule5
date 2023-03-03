package com.becasestudymodule5.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Account account;
    private String dateTime;
    private String content;
    @ManyToOne
    private Status status;

}
