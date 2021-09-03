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
   * Last Name
   */
  @ApiModelProperty(value = "lastName", required = true)
  @NotBlank(message = "名称不能为空")
  private String lastName;
}
