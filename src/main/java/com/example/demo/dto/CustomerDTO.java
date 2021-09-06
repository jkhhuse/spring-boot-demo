package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
@ApiModel(description = "API分组DTO")
public class CustomerDTO {

  /**
   * First Name
   */
  @ApiModelProperty(value = "firstName", required = true)
  @NotBlank(message = "firstName 名称不能为空")
  private String firstName;

  /**
   * Last Name
   */
  @ApiModelProperty(value = "lastName", required = true)
  @NotBlank(message = "lastName 名称不能为空")
  private String lastName;
}
