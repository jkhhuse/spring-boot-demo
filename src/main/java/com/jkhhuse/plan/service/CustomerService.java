package com.jkhhuse.plan.service;

import com.jkhhuse.plan.dto.CustomerDTO;
import com.jkhhuse.plan.entity.CustomerDO;

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

    /**
     * 根据 id 删除 Customer
     * @param id
     */
    void deleteById(long id);

    /**
     * 更新 Customer 信息
     * @param lastName
     * @return
     */
    CustomerDO updateCustomer(long id, String lastName);

}
