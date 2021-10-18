package com.jkhhuse.plan.vo.person;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(description = "Person 实体")
public class PersonVO {

    @ApiModelProperty(value = "Person uuid", required = true)
    private Long uuid;

    @ApiModelProperty(value = "name", required = true)
    private String name;

    @ApiModelProperty(value = "create_time", required = true)
    private String create_time;

    @ApiModelProperty(value = "born_time", required = true)
    private String born_time;

    @ApiModelProperty(value = "origin", required = true)
    private Float origin;

    @ApiModelProperty(value = "addr", required = true)
    private String addr;

    @ApiModelProperty(value = "email", required = true)
    private String email;

    @ApiModelProperty(value = "paaswd", required = true)
    private String paaswd;
}
