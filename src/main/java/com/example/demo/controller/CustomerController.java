package com.example.demo.controller;

import java.util.List;

import com.example.demo.dao.CustomerDao;
import com.example.demo.common.CommonResponse;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.CustomerDO;
import com.example.demo.service.CustomerService;
import com.example.demo.vo.CustomerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.validation.Valid;

@Api("desc of class")
@RestController
@RequestMapping("/userApi")
public class CustomerController {

  @Resource
  private CustomerService customerService;

  @ApiOperation(value = "查询LastName", notes = "根据名称进行搜索")
  @GetMapping("/search/{name}")
  CommonResponse<List<CustomerVO>> search(@ApiParam(value = "名称", required = true) @PathVariable String name) {
    List<CustomerDO> customerDOList =  customerService.findByLastName(name);
    return new CommonResponse("200", customerDOList, "test");
  }

  @ApiOperation(value = "新增用户", notes = "新增一条记录")
  @PostMapping(value = "/add", consumes = "application/json")
  CommonResponse<List<CustomerVO>> addCustomer(
          @ApiParam(value = "客户信息", required = true) @Valid @RequestBody CustomerDTO customerDTO) {
    String customerId = customerService.addCustomer(customerDTO);
    return new CommonResponse("200", customerId, "Customer 添加成功");
  }

  @ApiOperation(value = "删除用户", notes = "根据ID删除")
  @DeleteMapping(value = "/delete/{id}")
  CommonResponse<String> deleteCustomer(
          @ApiParam(value = "ID", required = true) @Valid @PathVariable Long id) {
    customerService.deleteById(id);
    return new CommonResponse("200", "success", "Customer 删除成功");
  }

  @ApiOperation(value = "更新用户名", notes = "根据ID更新用户名")
  @PutMapping(value = "/update/{id}")
  CommonResponse<String> updateCustomer(
          @ApiParam(value = "ID", required = true) @Valid @PathVariable Long id,
          @ApiParam(value = "LastName", required = true) @Valid @RequestParam String lastName) {
    CustomerDO customerDO = customerService.updateCustomer(id, lastName);
    return new CommonResponse("200", customerDO, "Customer 更新成功");
  }
}
