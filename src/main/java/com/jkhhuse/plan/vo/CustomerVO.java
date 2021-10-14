package com.jkhhuse.plan.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(description = "Customer 实体")
public class CustomerVO {

  @ApiModelProperty(value = "Customer id")
  private Long id;

  @ApiModelProperty(value = "API分组firstName")
  private String firstName;

  @ApiModelProperty(value = "API分组lastName", required = true)
  private String lastName;
}