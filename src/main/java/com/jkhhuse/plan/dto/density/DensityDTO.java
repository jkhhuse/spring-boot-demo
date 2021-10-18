package com.jkhhuse.plan.dto.density;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@ApiModel(description = "Density DTO")
public class DensityDTO {

    @ApiModelProperty(value = "person_uuid", required = true)
    @NotBlank(message = "人员 id 不能为空")
    private String person_uuid;

    @ApiModelProperty(value = "measure_time", required = true)
    @NotBlank(message = "测量时间不能为空")
    private String measure_time;

    @ApiModelProperty(value = "measure_value", required = true)
    @NotNull(message = "测量值不能为空")
    private Float measure_value;
}
