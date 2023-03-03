package com.becasestudymodule5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Status {
    @Id
    private Long id;
    private String nameStatus;

}
