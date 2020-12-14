package com.linglett.pojo;

import lombok.Data;

@Data
public class shop {
    private long id;
    private String userId;
    private String shopName;
    private long orderId;
    private long commodityId;
}
