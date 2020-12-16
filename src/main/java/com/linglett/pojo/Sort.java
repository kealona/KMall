package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sort {
    private long id;
    private long parent_id;
    private String name;
}
