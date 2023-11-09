package com.woniu.aw.springboot.jgdt.dto;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * DTO
 * </p>
 *
 * @author ldl
 * @since 2023-11-08
 */
@Data
@ApiModel(value = "User对象", description = "")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户-角色-维度表主键id")
    private Integer id;

    @ApiModelProperty("")
    private Long userName;

    @ApiModelProperty("")
    private Long roleId;

    @ApiModelProperty("")
    private Long userAge;

    @ApiModelProperty("")
    private String userEmail;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;
}
