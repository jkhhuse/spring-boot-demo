package com.jkhhuse.plan.vo.density;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(description = "Density 实体")
public class DensityVO {

    @ApiModelProperty(value = "person_uuid", required = true)
    private String person_uuid;

    @ApiModelProperty(value = "measure_time", required = true)
    private String measure_time;

    @ApiModelProperty(value = "measure_value", required = true)
    private Float measure_value;
}
