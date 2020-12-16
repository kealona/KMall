package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Footprint {
    private long id;
    private String date;
    private long proId;
}
