package com.example.demo.service.impl;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.CustomerDO;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        //TODO: 校验
        CustomerDO customerDO = new CustomerDO();
        customerDO.setFirstName(customerDTO.getFirstName());
        customerDO.setLastName(customerDTO.getLastName());
        customerDao.save(customerDO);
        return customerDO.getId().toString();
    }

    @Override
    public List<CustomerDO> findByLastName(String lastName) {
        return customerDao.findByLastName(lastName);
    }

    @Override
    public CustomerDO findById(long id) {
        return customerDao.findById(id);
    }

}
