package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class goods {
    private long id;
    private String title;
    private String price;
    private String number;
    private String image;
    private long sortId;
    private String status;
    private Date created;
}
