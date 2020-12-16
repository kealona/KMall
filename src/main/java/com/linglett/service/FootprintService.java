package com.linglett.service;

import com.linglett.pojo.Footprint;

import java.util.List;

public interface FootprintService {

    void addFootprint(Footprint footprint);

    void deleteFootprint(Footprint footprint);

    List<Footprint> queryFootprint(String id);
}
