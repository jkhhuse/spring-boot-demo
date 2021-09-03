package com.example.demo;

import java.util.List;

import com.example.demo.entity.CustomerDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDO, Long> {

	List<CustomerDO> findByLastName(String lastName);

	CustomerDO findById(long id);
}