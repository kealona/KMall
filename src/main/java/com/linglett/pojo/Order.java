package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Order {
    private long id;
    private long shoppingId;
    private BigDecimal payment;
    private BigDecimal postage;
    private int status;
    private String sendTime;
    private String endTime;
    private String payTime;
    private String crated;
    private String closeTime;
}
