package com.example.demo;

import java.util.List;
import com.example.demo.common.CommonResponse;
import com.example.demo.vo.CustomerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
