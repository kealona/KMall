package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Address {
    private long id;
    private String userId;
    private long orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverProvince;
    private String city;
    private String district;
    private String address;
    private String created;
    private String postcode;
    private int isDefault;
}
