package com.vuestudy.demo1101.entity;

import lombok.*;

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
