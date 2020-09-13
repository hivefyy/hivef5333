package com.example.demo0911.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

}
