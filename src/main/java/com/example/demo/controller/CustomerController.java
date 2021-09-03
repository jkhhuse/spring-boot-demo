package com.example.demo.controller;

import java.util.List;

import com.example.demo.CustomerRepository;
import com.example.demo.common.CommonResponse;
import com.example.demo.vo.CustomerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api("desc of class")
@RestController
@RequestMapping("/userApi")
public class CustomerController {

  private final CustomerRepository repository;

  public CustomerController(CustomerRepository repository) {
    this.repository = repository;
  }

  @ApiOperation(value = "查询LastName", notes = "根据名称进行搜索")
  @GetMapping("/search/{name}")
  CommonResponse<List<CustomerVO>> search(@ApiParam(value = "名称", required = true) @PathVariable String name) {
    return new CommonResponse("200", repository.findByLastName(name), "test");
  }

  @ApiOperation(value = "新增用户", notes = "新增一条记录")
  @PostMapping(value = "/add", consumes = "application/json")
  CommonResponse<List<CustomerVO>> addCustomer(@ApiParam(value = "名称", required = true) @PathVariable String name) {
    return new CommonResponse("200", repository.findByLastName(name), "test");
  }

}
