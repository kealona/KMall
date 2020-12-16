package com.linglett.dao;

import com.linglett.pojo.Footprint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootprintMapper {
    /**
     * 添加一个历史记录
     * @param footprint 历史记录info
     */
    void addFootprint(@Param("addFootprint") Footprint footprint);

    /**
     * 删除一个历史记录
     * @param footprint 删除历史记录
     */
    void deleteFootprint(@Param("deleteFootprint") Footprint footprint);

    /**
     * 根据id查询一个人的所有历史记录
     * @param id 用户的id
     */
    List<Footprint> queryFootprint(@Param("queryFootprint") String id);
}
