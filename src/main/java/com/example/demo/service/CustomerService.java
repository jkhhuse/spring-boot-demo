package com.example.demo.service;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.CustomerDO;

import java.util.List;

public interface CustomerService {

    /**
     * 新增客户信息
     * @param customerDTO
     * @return
     */
    String addCustomer(CustomerDTO customerDTO);

    /**
     * 依据 lastName 查询
     * @param lastName
     * @return
     */
    List<CustomerDO> findByLastName(String lastName);

    /**
     * 根据 id 查询
     * @param id
     * @return
     */
    CustomerDO findById(long id);
}
