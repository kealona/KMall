package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class goods {
    private long id;
    private String title;
    private BigDecimal price;
    private long imageId;
    private String describe;
    private long sortId;
    private int status;
    private Date created;
    private String cover;

}
