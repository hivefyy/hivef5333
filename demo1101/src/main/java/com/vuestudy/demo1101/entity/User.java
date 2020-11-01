package com.vuestudy.demo1101.entity;

import lombok.*;

import java.util.StringTokenizer;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    Integer id;
    String username;
    String password;
}
