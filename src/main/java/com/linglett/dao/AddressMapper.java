package com.linglett.dao;

import com.linglett.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {

    /**
     * 一个用户添加收货地址
     * @param address 添加地址的信息
     */
    void addAddress(@Param("addAddress")Address address);

    /**
     * 删除收货地址
     * @param id 要删除的地址
     */
    void deleteAddress(@Param("deleteAddressId") long id);

    /**
     * 修改收货地址
     * @param address 要修改的地址信息
     */
    void updateAddress(@Param("updateAddress") Address address);

    /**
     * 根据一个用户的id，查询她的所有收货地址
     * @param id 用户id
     * @return 返回查询结果
     */
    List<Address> queryAddress(@Param("queryAddressId") String id);
}
