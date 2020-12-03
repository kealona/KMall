package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String password;
    private String username;
    private String sex;
    private String email;
    private String phone;
    private String headImg;
    private String createTime;
    private int role;
    private Date description;
}
