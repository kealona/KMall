package com.linglett.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Cart {
    private long id;
    private String userId;
    private long proId;
    private int number;
    private Date created;
}
