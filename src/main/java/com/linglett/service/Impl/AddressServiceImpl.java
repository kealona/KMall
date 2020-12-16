package com.linglett.service.Impl;

import com.linglett.dao.AddressMapper;
import com.linglett.pojo.Address;
import com.linglett.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {

    private AddressMapper addressMapper;

    @Autowired
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public void addAddress(Address address) {
        addressMapper.addAddress(address);
    }

    @Override
    public void deleteAddress(long id) {
        addressMapper.deleteAddress(id);
    }

    @Override
    public void updateAddress(Address address) {
        addressMapper.updateAddress(address);
    }

    @Override
    public List<Address> queryAddress(String id) {
        return addressMapper.queryAddress(id);
    }
}
