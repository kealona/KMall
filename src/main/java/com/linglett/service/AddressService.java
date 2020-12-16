package com.linglett.service;

import com.linglett.pojo.Address;

import java.util.List;

public interface AddressService {

    /**
     * 添加收货地址
     * @param address 收货地址的详细信息
     */
    void addAddress(Address address);

    /**
     * 删除收货地址
     * @param id 要删除的收货地址的id
     */
    void deleteAddress(long id);

    /**
     * 修改收货地址的信息
     * @param address 要修改的信息
     */
    void updateAddress(Address address);

    /**
     * 查询某个用户的所有用户信息
     * @param id 查询的用户id
     * @return 返回查询结果
     */
    List<Address> queryAddress(String id);
}
