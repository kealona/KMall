package com.linglett.service.Impl;

import com.linglett.dao.FootprintMapper;
import com.linglett.pojo.Footprint;
import com.linglett.service.FootprintService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FootprintServiceImpl implements FootprintService {

    private FootprintMapper footprintMapper;

    @Autowired
    public void setFootprintMapper(FootprintMapper footprintMapper) {
        this.footprintMapper = footprintMapper;
    }

    @Override
    public void addFootprint(Footprint footprint) {
        footprintMapper.addFootprint(footprint);
    }

    @Override
    public void deleteFootprint(Footprint footprint) {
        footprintMapper.deleteFootprint(footprint);
    }

    @Override
    public List<Footprint> queryFootprint(String id) {
        List<Footprint> footprintList = footprintMapper.queryFootprint(id);
        return footprintList;
    }
}
