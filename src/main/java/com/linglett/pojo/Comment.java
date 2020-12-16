package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {
    private long id;
    private long parent_id;
    private String content;
    private String created;
    private String username;
}
