package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CustomerDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<CustomerDO, Long> {

	List<CustomerDO> findByLastName(String lastName);

	CustomerDO findById(long id);

}