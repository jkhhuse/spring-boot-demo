package com.jkhhuse.plan.service.impl;

import com.jkhhuse.plan.dao.CustomerDao;
import com.jkhhuse.plan.dto.CustomerDTO;
import com.jkhhuse.plan.entity.CustomerDO;
import com.jkhhuse.plan.service.CustomerService;
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

    public void deleteById(long id) {
        //TODO: 判断是否存在 id 对应的记录
        customerDao.deleteById(id);
    }

    @Override
    public CustomerDO updateCustomer(long id, String lastName) {
        CustomerDO customerDO = customerDao.findById(id);
        if (customerDO == null) {
            throw new RuntimeException("查询不到该用户!");
        }
        customerDO.setLastName(lastName);
        customerDao.save(customerDO);
        return customerDO;
    }
}
